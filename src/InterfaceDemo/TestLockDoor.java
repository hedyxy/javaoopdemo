package InterfaceDemo;

public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor lockDoor=new LockDoor();
        lockDoor.openDoor();
        lockDoor.openLock();
        lockDoor.closeDoor();
        lockDoor.closeLock();
        lockDoor.photo();
    }
}
