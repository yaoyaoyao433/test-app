package de.greenrobot.dao;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class DaoConfig implements Cloneable {
    final String[] allColumns;
    final SQLiteDatabase db;
    private IdentityScope<?, ?> identityScope;
    final boolean keyIsNumeric;
    final String[] nonPkColumns;
    final String[] pkColumns;
    final Property pkProperty;
    final Property[] properties;
    final TableStatements statements;
    final String tablename;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DaoConfig(SQLiteDatabase sQLiteDatabase, Class<? extends AbstractDao<?, ?>> cls) {
        this.db = sQLiteDatabase;
        try {
            this.tablename = (String) cls.getField("TABLENAME").get(null);
            Property[] reflectProperties = reflectProperties(cls);
            this.properties = reflectProperties;
            this.allColumns = new String[reflectProperties.length];
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Property property = null;
            for (int i = 0; i < reflectProperties.length; i++) {
                Property property2 = reflectProperties[i];
                String str = property2.columnName;
                this.allColumns[i] = str;
                if (property2.primaryKey) {
                    arrayList.add(str);
                    property = property2;
                } else {
                    arrayList2.add(str);
                }
            }
            this.nonPkColumns = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            this.pkColumns = (String[]) arrayList.toArray(new String[arrayList.size()]);
            boolean z = true;
            this.pkProperty = this.pkColumns.length == 1 ? property : null;
            this.statements = new TableStatements(sQLiteDatabase, this.tablename, this.allColumns, this.pkColumns);
            if (this.pkProperty != null) {
                Class<?> cls2 = this.pkProperty.type;
                if (!cls2.equals(Long.TYPE) && !cls2.equals(Long.class) && !cls2.equals(Integer.TYPE) && !cls2.equals(Integer.class) && !cls2.equals(Short.TYPE) && !cls2.equals(Short.class) && !cls2.equals(Byte.TYPE) && !cls2.equals(Byte.class)) {
                    z = false;
                }
                this.keyIsNumeric = z;
                return;
            }
            this.keyIsNumeric = false;
        } catch (Exception e) {
            throw new DaoException("Could not init DAOConfig", e);
        }
    }

    private static Property[] reflectProperties(Class<? extends AbstractDao<?, ?>> cls) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        Field[] declaredFields = Class.forName(String.valueOf(cls.getName()) + "$Properties").getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get(null);
                if (obj instanceof Property) {
                    arrayList.add((Property) obj);
                }
            }
        }
        Property[] propertyArr = new Property[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Property property = (Property) it.next();
            if (propertyArr[property.ordinal] != null) {
                throw new DaoException("Duplicate property ordinals");
            }
            propertyArr[property.ordinal] = property;
        }
        return propertyArr;
    }

    DaoConfig(DaoConfig daoConfig) {
        this.db = daoConfig.db;
        this.tablename = daoConfig.tablename;
        this.properties = daoConfig.properties;
        this.allColumns = daoConfig.allColumns;
        this.pkColumns = daoConfig.pkColumns;
        this.nonPkColumns = daoConfig.nonPkColumns;
        this.pkProperty = daoConfig.pkProperty;
        this.statements = daoConfig.statements;
        this.keyIsNumeric = daoConfig.keyIsNumeric;
    }

    /* renamed from: clone */
    public final DaoConfig m38clone() {
        return new DaoConfig(this);
    }

    public final IdentityScope<?, ?> getIdentityScope() {
        return this.identityScope;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIdentityScope(IdentityScope<?, ?> identityScope) {
        this.identityScope = identityScope;
    }

    public final void initIdentityScope(IdentityScopeType identityScopeType) {
        if (identityScopeType == IdentityScopeType.None) {
            this.identityScope = null;
        } else if (identityScopeType == IdentityScopeType.Session) {
            if (this.keyIsNumeric) {
                this.identityScope = new IdentityScopeLong();
            } else {
                this.identityScope = new IdentityScopeObject();
            }
        } else {
            throw new IllegalArgumentException("Unsupported type: ".concat(String.valueOf(identityScopeType)));
        }
    }
}
