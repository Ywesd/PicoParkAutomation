package pico;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Controls extends ListenerAdapter {
	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		String rawMessage = event.getMessage().getContentRaw(); String name = event.getAuthor().getEffectiveName();
		System.out.println(name + ": " + rawMessage);
		while (rawMessage.length() > 0) {
			int index = rawMessage.indexOf(",") == -1 ? rawMessage.length() : rawMessage.indexOf(",");
			movement(rawMessage.substring(0, index), name);
			if (index == rawMessage.length()) { break; }
			rawMessage = rawMessage.substring(index + 1);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void movement(String rawMessage, String name) {
		int time = 1000;
		try {
			time = Integer.parseInt(rawMessage.substring(1));
		}
		catch (NumberFormatException e) {}
		rawMessage = rawMessage.substring(0, 1);
		// WASD and Space
		switch (rawMessage.toLowerCase()) {
		case "w":
			System.out.println(name + " told the bot W to press W");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_W); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_W);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "a":
			System.out.println(name + " told the bot A to press A");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_A); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_A);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "s":
			System.out.println(name + " told the bot S to press S");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_S); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_S);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "d":
			System.out.println(name + " told the bot D to press D");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_D); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_D);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "x":
			System.out.println(name + " told the bot X to press SPACE");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_SPACE); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_SPACE);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		// JUMP RIGHT AND JUMP LEFT
		case "e":
			System.out.println(name + " told the bot E to JUMP RIGHT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_D); keyboard.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_SPACE); keyboard.keyRelease(KeyEvent.VK_D);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "q":
			System.out.println(name + " told the bot Q to JUMP LEFT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_A); keyboard.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_SPACE); keyboard.keyRelease(KeyEvent.VK_A);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		// REPEAT FOR 2nd
		case "i":
			System.out.println(name + " told the bot I to press UP");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_UP); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_UP);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "j":
			System.out.println(name + " told the bot J to press LEFT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_LEFT); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_LEFT);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "k":
			System.out.println(name + " told the bot K to press DOWN");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_DOWN); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_DOWN);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "l":
			System.out.println(name + " told the bot L to press RIGHT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_RIGHT); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_RIGHT);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case ",":
			System.out.println(name + " told the bot X to press SHIFT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_SHIFT); Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_SHIFT);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
			// JUMP RIGHT AND JUMP LEFT
		case "o":
			System.out.println(name + " told the bot E to JUMP RIGHT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_RIGHT); keyboard.keyPress(KeyEvent.VK_SHIFT);
			Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_SHIFT); keyboard.keyRelease(KeyEvent.VK_RIGHT);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "u":
			System.out.println(name + " told the bot Q to JUMP LEFT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_LEFT); keyboard.keyPress(KeyEvent.VK_SHIFT);
			Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_SHIFT); keyboard.keyRelease(KeyEvent.VK_LEFT);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		// PUSHING
		case "n":
			System.out.println(name + " told the bot M to PUSH RIGHT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_RIGHT); keyboard.keyPress(KeyEvent.VK_D);
			Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_RIGHT); keyboard.keyRelease(KeyEvent.VK_D);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "c":
			System.out.println(name + " told the bot Z to PUSH LEFT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_LEFT); keyboard.keyPress(KeyEvent.VK_A);
			Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_LEFT); keyboard.keyRelease(KeyEvent.VK_A);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		// BOTH JUMPING
		case "b":
			System.out.println(name + " told the bot M to PUSH RIGHT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_RIGHT); keyboard.keyPress(KeyEvent.VK_D);
			keyboard.keyPress(KeyEvent.VK_SPACE); keyboard.keyPress(KeyEvent.VK_SHIFT);
			Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_RIGHT); keyboard.keyRelease(KeyEvent.VK_D);
			keyboard.keyRelease(KeyEvent.VK_SPACE); keyboard.keyRelease(KeyEvent.VK_SHIFT);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		case "v":
			System.out.println(name + " told the bot X to BOTH JUMP LEFT");
			try { Robot keyboard = new Robot(); keyboard.keyPress(KeyEvent.VK_LEFT); keyboard.keyPress(KeyEvent.VK_A);
			keyboard.keyPress(KeyEvent.VK_SPACE); keyboard.keyPress(KeyEvent.VK_SHIFT);
			Thread.sleep(time); keyboard.keyRelease(KeyEvent.VK_LEFT); keyboard.keyRelease(KeyEvent.VK_A);
			keyboard.keyRelease(KeyEvent.VK_SPACE); keyboard.keyRelease(KeyEvent.VK_SHIFT);
			} catch (AWTException e) { e.printStackTrace(); } catch (InterruptedException e) { e.printStackTrace(); } break;
		}
		System.out.println("");
	}
}