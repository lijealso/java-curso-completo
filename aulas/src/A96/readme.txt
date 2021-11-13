https://stackoverflow.com/questions/19602601/create-an-arraylist-with-multiple-object-types

class Stuff {
    private String label;
    private Integer value;

    // Constructor or setter
    public void Stuff(String label, Integer value) {
        if (label == null || value == null) {
            return;
        }
        this.label = label;
        this.value = value;
    }

    // getters

    public String getLabel() {
        return this.label;
    }

    public Integer getValue() {
        return this.value;
    }
}
Then in your code:

private ArrayList<Stuff> items = new ArrayList<Stuff>();
items.add(new Stuff(label, value));

for (Stuff item: items) {
     doSomething(item.getLabel()); // returns String
     doSomething(item.getValue()); // returns Integer
}