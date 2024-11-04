import java.util.Iterator;
import java.util.List;

public class ArticleIterator implements Iterator<ArticleComponent> {
    private List<ArticleComponent> components;
    private int index = 0;

    public ArticleIterator(List<ArticleComponent> components) {
        this.components = components;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public ArticleComponent next() {
        if (hasNext()) {
            return components.get(index++);
        }
        return null;
    }
}
