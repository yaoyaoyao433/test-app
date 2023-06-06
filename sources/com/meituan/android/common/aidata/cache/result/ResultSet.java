package com.meituan.android.common.aidata.cache.result;

import android.database.Cursor;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.cache.table.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResultSet {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<ResultRow> mList;
    private int rowCount;

    public ResultSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31a5e8032c1341d47d0587255ba77ca8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31a5e8032c1341d47d0587255ba77ca8");
        } else {
            this.mList = new ArrayList<>();
        }
    }

    public List<ResultRow> getResultList() {
        return this.mList;
    }

    public void addRows(Cursor cursor) {
        Object[] objArr = {cursor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d921bac66a0a6a5e97e77df2718c2210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d921bac66a0a6a5e97e77df2718c2210");
        } else if (cursor != null) {
            new StringBuilder("--- cursor.count: ").append(cursor.getCount());
            cursor.moveToFirst();
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ResultRow.RowBuilder rowBuilder = new ResultRow.RowBuilder(i);
                for (int i3 = 0; i3 < cursor.getColumnCount(); i3++) {
                    rowBuilder.add(cursor.getColumnName(i3), Utils.get(cursor, i3, cursor.getColumnName(i3)));
                }
                addRow(rowBuilder.build());
                if (!cursor.moveToNext()) {
                    return;
                }
                i = i2;
            }
        }
    }

    private void addRow(ResultRow resultRow) {
        Object[] objArr = {resultRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad027a29874024ef2bb89078500f6093", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad027a29874024ef2bb89078500f6093");
        } else if (resultRow == null) {
        } else {
            this.mList.add(resultRow);
            this.rowCount++;
        }
    }
}
