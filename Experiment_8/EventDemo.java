interface EventHandler {
    void handleEvent();
}

class EventDemo {
    // Method with a local inner class
    public void registerEvent() {
        class LocalEventHandler implements EventHandler {
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }
        
        EventHandler localHandler = new LocalEventHandler();
        localHandler.handleEvent();
    }

    // Main method
    public static void main(String[] args) {
        EventDemo eventDemo = new EventDemo();
        eventDemo.registerEvent();
        
        // Anonymous inner class implementation
        EventHandler anonymousHandler = new EventHandler() {
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };
        
        anonymousHandler.handleEvent();
    }
}

