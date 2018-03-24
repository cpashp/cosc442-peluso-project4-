package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	//private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		//i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
	}
	
	@Test
	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}
	
	@Test
	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}
	
	@Test
	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	@Test
	public void testAddInventory1() {
		assertTrue(cm.addInventory(3, 1, 1, 1));
	}
	
	@Test
	public void testCheckInventory() {
		cm.addInventory(3, 1, 1, 1);
		assertEquals(cm.inventory, cm.checkInventory());
	}
	
	@Test
	public void testPurchaseBeverage1() {
		cm.addRecipe(r1);
		cm.addInventory(3, 1, 1, 1);
		assertEquals(0, cm.makeCoffee(r1, 50));
	}
	
	@Test(expected = Exception.class)
	public void testPurchaseBeverage2() {
		cm.addRecipe(r1);
		cm.addInventory(3, 1, 1, 1);
		cm.makeCoffee(r1, 5);
	}
	
	@Test(expected = Exception.class)
	public void testPurchaseBeverage3() {
		cm.addRecipe(r1);
		cm.makeCoffee(r1, 50);
	}
	
	public void testGetRecipes_1()
			throws Exception {
			CoffeeMaker fixture = new CoffeeMaker();

			Recipe[] result = fixture.getRecipes();

			// add additional test code here
			assertNotNull(result);
			assertEquals(4, result.length);
			assertNotNull(result[0]);
			assertEquals(null, result[0].toString());
			assertEquals(null, result[0].getName());
			assertEquals(0, result[0].getAmtCoffee());
			assertEquals(0, result[0].getPrice());
			assertEquals(0, result[0].getAmtChocolate());
			assertEquals(0, result[0].getAmtSugar());
			assertEquals(0, result[0].getAmtMilk());
			assertNotNull(result[1]);
			assertEquals(null, result[1].toString());
			assertEquals(null, result[1].getName());
			assertEquals(0, result[1].getAmtCoffee());
			assertEquals(0, result[1].getPrice());
			assertEquals(0, result[1].getAmtChocolate());
			assertEquals(0, result[1].getAmtSugar());
			assertEquals(0, result[1].getAmtMilk());
			assertNotNull(result[2]);
			assertEquals(null, result[2].toString());
			assertEquals(null, result[2].getName());
			assertEquals(0, result[2].getAmtCoffee());
			assertEquals(0, result[2].getPrice());
			assertEquals(0, result[2].getAmtChocolate());
			assertEquals(0, result[2].getAmtSugar());
			assertEquals(0, result[2].getAmtMilk());
			assertNotNull(result[3]);
			assertEquals(null, result[3].toString());
			assertEquals(null, result[3].getName());
			assertEquals(0, result[3].getAmtCoffee());
			assertEquals(0, result[3].getPrice());
			assertEquals(0, result[3].getAmtChocolate());
			assertEquals(0, result[3].getAmtSugar());
			assertEquals(0, result[3].getAmtMilk());
		}
	
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
	}
	
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
	}
	
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
	}
	
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = new CoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtMilk());
	}
}