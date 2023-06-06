package de.greenrobot.dao;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.common.CommonConstant;
import de.greenrobot.dao.WhereCondition;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class QueryBuilder<T> {
    public static boolean LOG_SQL;
    public static boolean LOG_VALUES;
    private final AbstractDao<T, ?> dao;
    private StringBuilder joinBuilder;
    private Integer limit;
    private Integer offset;
    private StringBuilder orderBuilder;
    private final String tablePrefix;
    private final List<Object> values;
    private final List<WhereCondition> whereConditions;

    /* JADX INFO: Access modifiers changed from: protected */
    public QueryBuilder(AbstractDao<T, ?> abstractDao) {
        this(abstractDao, "T");
    }

    protected QueryBuilder(AbstractDao<T, ?> abstractDao, String str) {
        this.dao = abstractDao;
        this.tablePrefix = str;
        this.values = new ArrayList();
        this.whereConditions = new ArrayList();
    }

    private void checkOrderBuilder() {
        if (this.orderBuilder == null) {
            this.orderBuilder = new StringBuilder();
        } else if (this.orderBuilder.length() > 0) {
            this.orderBuilder.append(CommonConstant.Symbol.COMMA);
        }
    }

    public QueryBuilder<T> where(WhereCondition whereCondition, WhereCondition... whereConditionArr) {
        this.whereConditions.add(whereCondition);
        for (WhereCondition whereCondition2 : whereConditionArr) {
            checkCondition(whereCondition2);
            this.whereConditions.add(whereCondition2);
        }
        return this;
    }

    public QueryBuilder<T> whereOr(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        this.whereConditions.add(or(whereCondition, whereCondition2, whereConditionArr));
        return this;
    }

    public WhereCondition or(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        return combineWhereConditions(" OR ", whereCondition, whereCondition2, whereConditionArr);
    }

    public WhereCondition and(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        return combineWhereConditions(" AND ", whereCondition, whereCondition2, whereConditionArr);
    }

    protected WhereCondition combineWhereConditions(String str, WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        StringBuilder sb = new StringBuilder(CommonConstant.Symbol.BRACKET_LEFT);
        ArrayList arrayList = new ArrayList();
        addCondition(sb, arrayList, whereCondition);
        sb.append(str);
        addCondition(sb, arrayList, whereCondition2);
        for (WhereCondition whereCondition3 : whereConditionArr) {
            sb.append(str);
            addCondition(sb, arrayList, whereCondition3);
        }
        sb.append(')');
        return new WhereCondition.StringCondition(sb.toString(), arrayList.toArray());
    }

    protected void addCondition(StringBuilder sb, List<Object> list, WhereCondition whereCondition) {
        checkCondition(whereCondition);
        whereCondition.appendTo(sb, this.tablePrefix);
        whereCondition.appendValuesTo(list);
    }

    protected void checkCondition(WhereCondition whereCondition) {
        if (whereCondition instanceof WhereCondition.PropertyCondition) {
            checkProperty(((WhereCondition.PropertyCondition) whereCondition).property);
        }
    }

    public <J> QueryBuilder<J> join(Class<J> cls, Property property) {
        throw new UnsupportedOperationException();
    }

    public <J> QueryBuilder<J> joinToMany(Class<J> cls, Property property) {
        throw new UnsupportedOperationException();
    }

    public QueryBuilder<T> orderAsc(Property... propertyArr) {
        orderAscOrDesc(" ASC", propertyArr);
        return this;
    }

    public QueryBuilder<T> orderDesc(Property... propertyArr) {
        orderAscOrDesc(" DESC", propertyArr);
        return this;
    }

    private void orderAscOrDesc(String str, Property... propertyArr) {
        for (Property property : propertyArr) {
            checkOrderBuilder();
            append(this.orderBuilder, property);
            if (String.class.equals(property.type)) {
                this.orderBuilder.append(" COLLATE LOCALIZED");
            }
            this.orderBuilder.append(str);
        }
    }

    public QueryBuilder<T> orderCustom(Property property, String str) {
        checkOrderBuilder();
        append(this.orderBuilder, property).append(Constants.SPACE);
        this.orderBuilder.append(str);
        return this;
    }

    public QueryBuilder<T> orderRaw(String str) {
        checkOrderBuilder();
        this.orderBuilder.append(str);
        return this;
    }

    protected StringBuilder append(StringBuilder sb, Property property) {
        checkProperty(property);
        sb.append(this.tablePrefix);
        sb.append(CommonConstant.Symbol.DOT_CHAR);
        sb.append('\'');
        sb.append(property.columnName);
        sb.append('\'');
        return sb;
    }

    protected void checkProperty(Property property) {
        if (this.dao != null) {
            Property[] properties = this.dao.getProperties();
            int length = properties.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (property == properties[i]) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return;
            }
            throw new DaoException("Property '" + property.name + "' is not part of " + this.dao);
        }
    }

    public QueryBuilder<T> limit(int i) {
        this.limit = Integer.valueOf(i);
        return this;
    }

    public QueryBuilder<T> offset(int i) {
        this.offset = Integer.valueOf(i);
        return this;
    }

    public Query<T> build() {
        String selectAll;
        int i;
        int i2;
        if (this.joinBuilder == null || this.joinBuilder.length() == 0) {
            selectAll = this.dao.getStatements().getSelectAll();
        } else {
            selectAll = SqlUtils.createSqlSelect(this.dao.getTablename(), this.tablePrefix, this.dao.getAllColumns());
        }
        StringBuilder sb = new StringBuilder(selectAll);
        appendWhereClause(sb, this.tablePrefix);
        if (this.orderBuilder != null && this.orderBuilder.length() > 0) {
            sb.append(" ORDER BY ");
            sb.append((CharSequence) this.orderBuilder);
        }
        if (this.limit != null) {
            sb.append(" LIMIT ?");
            this.values.add(this.limit);
            i = this.values.size() - 1;
        } else {
            i = -1;
        }
        if (this.offset == null) {
            i2 = -1;
        } else if (this.limit == null) {
            throw new IllegalStateException("Offset cannot be set without limit");
        } else {
            sb.append(" OFFSET ?");
            this.values.add(this.offset);
            i2 = this.values.size() - 1;
        }
        String sb2 = sb.toString();
        if (LOG_SQL) {
            DaoLog.d("Built SQL for query: ".concat(String.valueOf(sb2)));
        }
        if (LOG_VALUES) {
            DaoLog.d("Values for query: " + this.values);
        }
        Query<T> query = new Query<>(this.dao, sb2, this.values);
        if (i != -1) {
            query.setLimitPosition(i);
        }
        if (i2 != -1) {
            query.setOffsetPosition(i2);
        }
        return query;
    }

    public DeleteQuery<T> buildDelete() {
        String tablename = this.dao.getTablename();
        StringBuilder sb = new StringBuilder(SqlUtils.createSqlDelete(tablename, null));
        appendWhereClause(sb, tablename);
        String sb2 = sb.toString();
        if (LOG_SQL) {
            DaoLog.d("Built SQL for delete query: ".concat(String.valueOf(sb2)));
        }
        if (LOG_VALUES) {
            DaoLog.d("Values for delete query: " + this.values);
        }
        return new DeleteQuery<>(this.dao, sb2, this.values);
    }

    public CountQuery<T> buildCount() {
        String tablename = this.dao.getTablename();
        StringBuilder sb = new StringBuilder(SqlUtils.createSqlSelectCountStar(tablename));
        appendWhereClause(sb, tablename);
        String sb2 = sb.toString();
        if (LOG_SQL) {
            DaoLog.d("Built SQL for count query: ".concat(String.valueOf(sb2)));
        }
        if (LOG_VALUES) {
            DaoLog.d("Values for count query: " + this.values);
        }
        return new CountQuery<>(this.dao, sb2, this.values);
    }

    private void appendWhereClause(StringBuilder sb, String str) {
        this.values.clear();
        if (this.whereConditions.isEmpty()) {
            return;
        }
        sb.append(" WHERE ");
        ListIterator<WhereCondition> listIterator = this.whereConditions.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            WhereCondition next = listIterator.next();
            next.appendTo(sb, str);
            next.appendValuesTo(this.values);
        }
    }

    public List<T> list() {
        return build().list();
    }

    public LazyList<T> listLazy() {
        return build().listLazy();
    }

    public LazyList<T> listLazyUncached() {
        return build().listLazyUncached();
    }

    public CloseableListIterator<T> listIterator() {
        return build().listIterator();
    }

    public T unique() {
        return build().unique();
    }

    public T uniqueOrThrow() {
        return build().uniqueOrThrow();
    }

    public long count() {
        return buildCount().count();
    }
}
