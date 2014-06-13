package war.api;

/**
 * data transfer.
 */
public abstract class AbstractDto<T> implements Dto<T> {
    private T target;

    public AbstractDto() { }

    public AbstractDto(T target) {
        setTarget(target);
    }

    public void setTarget(T target) {
        this.target = target;
    }

    protected T getTarget() {
        return target;
    }
}