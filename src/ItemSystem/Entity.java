package ItemSystem;

//import ItemSystem.IdList.Node;

/**
 * Base class for all entities (game items)
 * <li>An entity can be stored in an InventorySlot which is stored in an Inventory</li>
 *
 * @see ItemSystem.Inventory
 * @see ItemSystem.InventorySlot
 */
public abstract class Entity {
    // identifiers
    private int id;
    private EntityType entityType;

    // game values
    private int numberOfEntities;
    private boolean stackable;
    private boolean deletable;
    private boolean sellable;
    private float sellPrice;
    private float buyPrice;
    private String name;
    private String description;

    // ===========================

    /**
     * Basic setup for an Entity.
     * @param name
     * @param description
     * @param sellPrice
     * @param buyPrice
     *
     * @see ItemSystem.Entities.Tool
     * @see ItemSystem.Entities.Weapon
     */
    public Entity(String name, String description, float sellPrice, float buyPrice, EntityType type, int numberOfEntities) {
        setName(name);
        setDescription(description);
        setSellPrice(sellPrice);
        setBuyPrice(buyPrice);
        setEntityType(type);
        setNumberOfEntities(numberOfEntities);
    }

    // ===========================

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public EntityType getEntityType() { return entityType; }
    public void setEntityType(EntityType e) { this.entityType = e; }

    public int getNumberOfEntities() { return numberOfEntities; }
    public void setNumberOfEntities(int numberOfEntities) {
        if (isStackable()) this.numberOfEntities = numberOfEntities;
        else this.numberOfEntities = 1;
    }

    public boolean isStackable() { return stackable; }
    public void setStackable(boolean stackable) { this.stackable = stackable; }

    public boolean isDeletable() { return deletable; }
    public void setDeletable(boolean deletable) { this.deletable = deletable; }

    public boolean isSellable() { return sellable; }
    public void setSellable(boolean sellable) { this.sellable = sellable; }

    public float getSellPrice() { return sellPrice; }
    public void setSellPrice(float sellPrice) { this.sellPrice = sellPrice; }

    public float getBuyPrice() { return buyPrice; }
    public void setBuyPrice(float buyPrice) { this.buyPrice = buyPrice; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}