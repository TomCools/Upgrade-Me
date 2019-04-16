package be.tomcools.upgrade.stream.log;

enum Priority {
    INFO,
    WARNING,
    ERROR;

    boolean lessThan(Priority other) {
        return other.compareTo(this) > 0;
    }

    boolean atMost(Priority other) {
        return other.compareTo(this) >= 0;
    }

    boolean atLeast(Priority other) {
        return other.compareTo(this) <= 0;
    }

    boolean moreThan(Priority other) {
        return other.compareTo(this) < 0;
    }

}
