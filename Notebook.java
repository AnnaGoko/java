public class Notebook {
    
    private String model;//модель ноутбука
    private double ram; //объем оперативной памяти
    private double storage;//объем жесткого диска
    private String os;//операционная система
    private String color;//цвет
  
    public Notebook(String model, double ram, double storage, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}'; 
    }
    
    public boolean equals(Notebook n) {
        return this.model.equals(n.model) 
            && this.ram == n.ram 
            && this.storage == n.storage
            && this.os.equals(n.os) 
            && this.color.equals(n.color);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(model, ram, storage, os, color);
    }
        
    public static void printNotebooks(List<Notebook> notebooks) {
        notebooks.forEach(System.out::println);
    }
    
    public static void findNotebook(List<Notebook> notebooks, Notebook n) {
        if(notebooks.contains(n)) {
            System.out.println("Ноутбук найден:");
            System.out.println(n);
        } else {
            System.out.println("Ноутбук не найден");
        }
    }
    
    public static List<Notebook> filterNotebooks(List<Notebook> notebooks, Map<String, Object> criteria) {
        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook n : notebooks) {
            boolean goodNotebook = true;
            for (String key : criteria.keySet()) {
                switch (key) {
                    case "ram":
                        goodNotebook = n.ram >= (Double) criteria.get(key);
                        break;
                    case "storage": 
                        goodNotebook = n.storage >= (Double) criteria.get(key);
                        break;
                    case "os":
                        goodNotebook = n.os.contains((String) criteria.get(key));
                        break;
                    case "color": 
                        goodNotebook = n.color.equals(criteria.get(key));
                        break;
                    
                }
                if (!goodNotebook) break;
            }
            if (goodNotebook) filteredNotebooks.add(n);
        }
        return filteredNotebooks;
    }
}