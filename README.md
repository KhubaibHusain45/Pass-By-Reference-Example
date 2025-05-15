In Move(First);, a copy of the reference to the object First is passed.

Both First and p point to the same object in memory, so changes via p affect First.

⚠️ However, if you reassign p = new Point(...) inside Move, it won’t affect First, because p is just a copy of the reference.

Java passes object references by value.

You can mutate the object via that reference.

You cannot reassign the reference and expect the original object to change.
