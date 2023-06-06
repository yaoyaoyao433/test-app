package de.greenrobot.dao;

import android.database.sqlite.SQLiteStatement;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DeleteQuery<T> extends AbstractQuery<T> {
    private SQLiteStatement compiledStatement;

    @Override // de.greenrobot.dao.AbstractQuery
    public /* bridge */ /* synthetic */ void setParameter(int i, Object obj) {
        super.setParameter(i, obj);
    }

    public DeleteQuery(AbstractDao<T, ?> abstractDao, String str, Collection<Object> collection) {
        super(abstractDao, str, collection);
    }

    public synchronized void executeDeleteWithoutDetachingEntities() {
        if (this.compiledStatement != null) {
            this.compiledStatement.clearBindings();
        } else {
            this.compiledStatement = this.dao.db.compileStatement(this.sql);
        }
        for (int i = 0; i < this.parameters.length; i++) {
            String str = this.parameters[i];
            if (str != null) {
                this.compiledStatement.bindString(i + 1, str);
            } else {
                this.compiledStatement.bindNull(i + 1);
            }
        }
        this.compiledStatement.execute();
    }
}
