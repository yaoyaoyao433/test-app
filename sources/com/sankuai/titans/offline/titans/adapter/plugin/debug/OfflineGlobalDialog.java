package com.sankuai.titans.offline.titans.adapter.plugin.debug;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.dianping.titans.offline.OfflineDebugInfo;
import com.dianping.titans.offline.entity.OfflineGlobalDebugItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.config.Config;
import com.sankuai.titans.config.ConfigManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OfflineGlobalDialog extends OfflineBaseDialog {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<OfflineGlobalDebugItem> mItems;

    public OfflineGlobalDialog(@NonNull Context context) {
        this(context, R.style.OfflineDialogTheme);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "169f6ffbea738c603501978a5445fadf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "169f6ffbea738c603501978a5445fadf");
        }
    }

    public OfflineGlobalDialog(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "141fda1713d954269b57d9cd65edaf4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "141fda1713d954269b57d9cd65edaf4f");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f81c3f6a58dd2f2e70617819b64c2d03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f81c3f6a58dd2f2e70617819b64c2d03");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.titans_view_debug_offline_global);
        boolean z = ((Config) ConfigManager.getConfig("webview", Config.class, new Config())).switcher.usingOffline;
        TextView textView = (TextView) findViewById(R.id.txt_global_switch);
        Context context = getContext();
        Object[] objArr2 = new Object[1];
        objArr2[0] = z ? "开" : "关";
        textView.setText(context.getString(R.string.offline_global_switch, objArr2));
        ((ImageView) findViewById(R.id.img_close)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.offline.titans.adapter.plugin.debug.OfflineGlobalDialog.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf777184583931e8b171df91c04fa71e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf777184583931e8b171df91c04fa71e");
                } else {
                    OfflineGlobalDialog.this.dismiss();
                }
            }
        });
        ListView listView = (ListView) findViewById(R.id.info_list);
        this.mItems = new ArrayList();
        List<OfflineGlobalDebugItem> list = OfflineDebugInfo.presetList;
        if (list.size() > 0) {
            this.mItems.addAll(list);
        }
        List<OfflineGlobalDebugItem> list2 = OfflineDebugInfo.globalOfflineList;
        if (list2.size() > 0) {
            this.mItems.addAll(list2);
        }
        if (this.mItems == null || this.mItems.size() <= 0) {
            return;
        }
        listView.setAdapter((ListAdapter) new OfflineGlobalAdapter(getContext(), this.mItems));
    }
}
