package de.greenrobot.dao;

import android.database.Cursor;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CountQuery<T> extends AbstractQuery<T> {
    @Override // de.greenrobot.dao.AbstractQuery
    public /* bridge */ /* synthetic */ void setParameter(int i, Object obj) {
        super.setParameter(i, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CountQuery(AbstractDao<T, ?> abstractDao, String str, Collection<Object> collection) {
        super(abstractDao, str, collection);
    }

    public long count() {
        Cursor rawQuery = this.dao.db.rawQuery(this.sql, this.parameters);
        try {
            if (!rawQuery.moveToNext()) {
                throw new DaoException("No result for count");
            }
            if (!rawQuery.isLast()) {
                throw new DaoException("Unexpected row count: " + rawQuery.getCount());
            } else if (rawQuery.getColumnCount() != 1) {
                throw new DaoException("Unexpected column count: " + rawQuery.getColumnCount());
            } else {
                return rawQuery.getLong(0);
            }
        } finally {
            rawQuery.close();
        }
    }
}
