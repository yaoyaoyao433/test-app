package de.greenrobot.dao;

import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Query<T> extends AbstractQuery<T> {
    private int limitPosition;
    private int offsetPosition;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Query(AbstractDao<T, ?> abstractDao, String str, Collection<Object> collection) {
        super(abstractDao, str, collection);
        this.limitPosition = -1;
        this.offsetPosition = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLimitPosition(int i) {
        this.limitPosition = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOffsetPosition(int i) {
        this.offsetPosition = i;
    }

    @Override // de.greenrobot.dao.AbstractQuery
    public void setParameter(int i, Object obj) {
        if (i >= 0 && (i == this.limitPosition || i == this.offsetPosition)) {
            throw new IllegalArgumentException("Illegal parameter index: ".concat(String.valueOf(i)));
        }
        if (obj != null) {
            this.parameters[i] = obj.toString();
        } else {
            this.parameters[i] = null;
        }
    }

    public void setLimit(int i) {
        if (this.limitPosition == -1) {
            throw new IllegalStateException("Limit must be set with QueryBuilder before it can be used here");
        }
        this.parameters[this.limitPosition] = Integer.toString(i);
    }

    public void setOffset(int i) {
        if (this.offsetPosition == -1) {
            throw new IllegalStateException("Offset must be set with QueryBuilder before it can be used here");
        }
        this.parameters[this.offsetPosition] = Integer.toString(i);
    }

    public List<T> list() {
        return this.dao.loadAllAndCloseCursor(this.dao.db.rawQuery(this.sql, this.parameters));
    }

    public LazyList<T> listLazy() {
        return new LazyList<>(this.dao, this.dao.db.rawQuery(this.sql, this.parameters), true);
    }

    public LazyList<T> listLazyUncached() {
        return new LazyList<>(this.dao, this.dao.db.rawQuery(this.sql, this.parameters), false);
    }

    public CloseableListIterator<T> listIterator() {
        return listLazyUncached().listIteratorAutoClose();
    }

    public T unique() {
        return this.dao.loadUniqueAndCloseCursor(this.dao.db.rawQuery(this.sql, this.parameters));
    }

    public T uniqueOrThrow() {
        T unique = unique();
        if (unique != null) {
            return unique;
        }
        throw new DaoException("No entity found for query");
    }
}
