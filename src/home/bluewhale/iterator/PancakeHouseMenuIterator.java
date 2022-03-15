package home.bluewhale.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.items=menuItems;
    }

    public MenuItem next() {
        return items.get(position++);
    }

    public boolean hasNext() {
        return items.size() > position;
    }
}
