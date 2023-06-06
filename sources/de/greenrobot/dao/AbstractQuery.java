package de.greenrobot.dao;

import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbstractQuery<T> {
    protected final AbstractDao<T, ?> dao;
    protected final String[] parameters;
    protected final String sql;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractQuery(AbstractDao<T, ?> abstractDao, String str, Collection<Object> collection) {
        this.dao = abstractDao;
        this.sql = str;
        this.parameters = new String[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj != null) {
                this.parameters[i] = obj.toString();
            } else {
                this.parameters[i] = null;
            }
            i++;
        }
    }

    public void setParameter(int i, Object obj) {
        if (obj != null) {
            this.parameters[i] = obj.toString();
        } else {
            this.parameters[i] = null;
        }
    }
}
