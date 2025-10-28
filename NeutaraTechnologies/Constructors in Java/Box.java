class Box {
    int length, width, height;

    Box() { length = width = height = 0; }          // Default
    Box(int l, int w, int h) {                     // Parameterized
        length = l; width = w; height = h;
    }
}
/*Key Points:

No return type (not even void).

Called automatically when an object is created.

Used for object initialization.

Can be overloaded, but not overridden. */
