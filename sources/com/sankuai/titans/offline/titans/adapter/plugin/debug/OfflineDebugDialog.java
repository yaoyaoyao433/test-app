package com.sankuai.titans.offline.titans.adapter.plugin.debug;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.dianping.titans.offline.OfflineDebugInfo;
import com.dianping.titans.offline.entity.OfflineDebugItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OfflineDebugDialog extends OfflineBaseDialog {
    public static ChangeQuickRedirect changeQuickRedirect;

    public OfflineDebugDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6047930e9355f47e3bd197ecc05a0ed6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6047930e9355f47e3bd197ecc05a0ed6");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2184aa9de8b04de75dbebbd2c57761cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2184aa9de8b04de75dbebbd2c57761cb");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.titans_view_debug_offline);
        ((ImageView) findViewById(R.id.img_close)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.offline.titans.adapter.plugin.debug.OfflineDebugDialog.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d9092ab68b8ff65ffc81546e230eac0", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d9092ab68b8ff65ffc81546e230eac0");
                } else {
                    OfflineDebugDialog.this.dismiss();
                }
            }
        });
        ListView listView = (ListView) findViewById(R.id.info_list);
        List<OfflineDebugItem> list = OfflineDebugInfo.pageOfflineList;
        if (list == null || list.size() <= 0) {
            return;
        }
        listView.setAdapter((ListAdapter) new OfflineDebugAdapter(getContext(), new ArrayList(list)));
    }
}
