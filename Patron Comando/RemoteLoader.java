public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        // 1. Crear todos los dispositivos (Receptores)
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        // 2. Crear todos los comandos individuales
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        // 3. Crear los arreglos para las Macros
        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };

        // 4. Instanciar los MacroCommands
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        // 5. Asignar la macro al botón 0 del control remoto
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        // 6. Ejecutar la prueba
        System.out.println(remoteControl);
        
        System.out.println("--- Pushing Party On---");
        remoteControl.onButtonWasPushed(0);
        
        System.out.println("\n--- Pushing Party Off---");
        remoteControl.offButtonWasPushed(0);
        
        System.out.println("\n--- Pushing Undo---");
        remoteControl.undoButtonWasPushed();
    }
}