package InterfaceSegregationPrinciple.isp;

public class CacheStore implements Store{
    @Override
    public void Save() {
        //Not need to implement
    }

    @Override
    public void Delete() {
        //Not need to implement
    }

    @Override
    public void Update() {
        //Not need to implement
    }

    @Override
    public void Fetch() {
        //Not need to implement
    }

    @Override
    public void AddKey() {
        //Need to implement
    }

    @Override
    public void RemoveKey() {
        //Need to implement
    }

    @Override
    public void Evict() {
        // Need to implement
    }
}
