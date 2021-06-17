package generics;

public interface IEntityRepository<T extends IEntity>{
	void add(T entity);
	void update(T entity);
	void remove(T entity);
}
