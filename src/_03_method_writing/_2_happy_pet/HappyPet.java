package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want? Cheetah, Wolf, Shark, or Eagle ");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
	while(happinessLevel < 101) {
//			
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "What to do", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Walk", "Feed", "Clean up poop" }, null);
			System.out.println(task);

			// 6. Use user input to call the appropriate method created in step 5 below.
			
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(task == 1) {
				feed();
			}
			else if(task == 2) {
				cleanUpPoop();
			}
			else if(task == 0) {
				walk();
			}
			
	}
	}

	private static void walk() {
		happinessLevel += 5;
		JOptionPane.showMessageDialog(null, "He needed to walk, he was getting fat");
	}

	private static void cleanUpPoop() {
		happinessLevel +=1;
		JOptionPane.showMessageDialog(null, "Your pet is clean");
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
		

		public static void feed() {
			happinessLevel += 10;
			JOptionPane.showMessageDialog(null, "Your pet is hungry");
		}
}