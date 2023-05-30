package efs.task.functional;

class PersonSpeakers {

    private final String HELLO = "Hello. I'm ";
    private final String CZESC = "Czesc. Jestem ";
    private final String HALLO = "Hallo, ich heiBe ";

    Speaker createGreetSpeaker() {
        return p -> HELLO + p.getName();
    }

    Speaker createShoutingSpeaker() {
        return p -> HELLO.toUpperCase() + p.getName().toUpperCase() + ".";
    }

    Speaker createGreetLocalSpeaker() {
        return p -> {
            String greeting;
            switch (p.getCountryOfLiving()) {
                case USA:
                    greeting = HELLO;
                    break;
                case PL:
                    greeting = CZESC;
                    break;
                case DE:
                    greeting = HALLO;
                    break;
                default:
                    greeting = HELLO;
                    break;
            }
            return greeting + p.getName() + ".";
        };
    }
}

