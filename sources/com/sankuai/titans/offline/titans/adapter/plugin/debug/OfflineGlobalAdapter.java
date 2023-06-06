package com.sankuai.titans.offline.titans.adapter.plugin.debug;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dianping.titans.offline.entity.OfflineGlobalDebugItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.Utils;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OfflineGlobalAdapter extends BaseAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;
    private final List<OfflineGlobalDebugItem> mItems;
    private final SimpleDateFormat mSimpleDateFormat;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public OfflineGlobalAdapter(Context context, List<OfflineGlobalDebugItem> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68657c606aa7802182673454a85c765a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68657c606aa7802182673454a85c765a");
            return;
        }
        this.mContext = context;
        this.mItems = list;
        this.mSimpleDateFormat = new SimpleDateFormat(Utils.LONG_DATE_FORMAT, Locale.CHINESE);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8d5203ddca15e10c6978f6a12f3bd27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8d5203ddca15e10c6978f6a12f3bd27")).intValue();
        }
        if (this.mItems == null) {
            return 0;
        }
        return this.mItems.size();
    }

    @Override // android.widget.Adapter
    public OfflineGlobalDebugItem getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0077259f4ecae8137b4bcf5f6b770267", RobustBitConfig.DEFAULT_VALUE) ? (OfflineGlobalDebugItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0077259f4ecae8137b4bcf5f6b770267") : this.mItems.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        OfflineGlobalViewHolder offlineGlobalViewHolder;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c81ef155ba196a8056098409c3b174b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c81ef155ba196a8056098409c3b174b7");
        }
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.titans_item_debug_offline_global, viewGroup, false);
            offlineGlobalViewHolder = new OfflineGlobalViewHolder(view);
            view.setTag(offlineGlobalViewHolder);
        } else {
            offlineGlobalViewHolder = (OfflineGlobalViewHolder) view.getTag();
        }
        OfflineGlobalDebugItem offlineGlobalDebugItem = this.mItems.get(i);
        offlineGlobalViewHolder.scopeTxt.setText(offlineGlobalDebugItem.scope);
        offlineGlobalViewHolder.groupTxt.setText(offlineGlobalDebugItem.group);
        offlineGlobalViewHolder.bundleNameTxt.setText(offlineGlobalDebugItem.bundleName);
        offlineGlobalViewHolder.bundleVersionTxt.setText(offlineGlobalDebugItem.bundleVersion);
        offlineGlobalViewHolder.hashTxt.setText(offlineGlobalDebugItem.hashCode);
        offlineGlobalViewHolder.timeTxt.setText(this.mSimpleDateFormat.format(Long.valueOf(offlineGlobalDebugItem.updateTime)));
        offlineGlobalViewHolder.isPresetTxt.setText(offlineGlobalDebugItem.isPreset ? "是" : "否");
        return view;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class OfflineGlobalViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public TextView bundleNameTxt;
        public TextView bundleVersionTxt;
        public TextView groupTxt;
        public TextView hashTxt;
        public TextView isPresetTxt;
        public TextView scopeTxt;
        public TextView timeTxt;

        public OfflineGlobalViewHolder(View view) {
            this.scopeTxt = (TextView) view.findViewById(R.id.txt_scope);
            this.hashTxt = (TextView) view.findViewById(R.id.txt_hash);
            this.groupTxt = (TextView) view.findViewById(R.id.txt_group);
            this.timeTxt = (TextView) view.findViewById(R.id.txt_time);
            this.bundleNameTxt = (TextView) view.findViewById(R.id.txt_name);
            this.bundleVersionTxt = (TextView) view.findViewById(R.id.txt_version);
            this.isPresetTxt = (TextView) view.findViewById(R.id.txt_preset);
        }
    }
}
