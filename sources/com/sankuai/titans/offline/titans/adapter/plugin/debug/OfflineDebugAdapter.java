package com.sankuai.titans.offline.titans.adapter.plugin.debug;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.dianping.titans.offline.entity.OfflineDebugItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OfflineDebugAdapter extends BaseAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;
    private final List<OfflineDebugItem> mItems;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public OfflineDebugAdapter(Context context, List<OfflineDebugItem> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce8b04d81def5455aa53f2e85956e46f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce8b04d81def5455aa53f2e85956e46f");
            return;
        }
        this.mContext = context;
        this.mItems = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf3751c57aa66f622a9bdcd3e0d58303", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf3751c57aa66f622a9bdcd3e0d58303")).intValue();
        }
        if (this.mItems == null) {
            return 0;
        }
        return this.mItems.size();
    }

    @Override // android.widget.Adapter
    public OfflineDebugItem getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47c2686cf96f06ac05caf2ba236eab4a", RobustBitConfig.DEFAULT_VALUE) ? (OfflineDebugItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47c2686cf96f06ac05caf2ba236eab4a") : this.mItems.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        OfflineDebugViewHolder offlineDebugViewHolder;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abc7dc5455c52b5b3edae34b52e99d4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abc7dc5455c52b5b3edae34b52e99d4b");
        }
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.titans_item_debug_offline, viewGroup, false);
            offlineDebugViewHolder = new OfflineDebugViewHolder(view);
            view.setTag(offlineDebugViewHolder);
        } else {
            offlineDebugViewHolder = (OfflineDebugViewHolder) view.getTag();
        }
        offlineDebugViewHolder.urlTxt.setText(getItem(i).url);
        offlineDebugViewHolder.scopeTxt.setText(getItem(i).scope);
        offlineDebugViewHolder.hashTxt.setText(getItem(i).packageHash);
        return view;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class OfflineDebugViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public TextView hashTxt;
        public TextView scopeTxt;
        public TextView urlTxt;

        public OfflineDebugViewHolder(View view) {
            this.urlTxt = (TextView) view.findViewById(R.id.txt_url);
            this.scopeTxt = (TextView) view.findViewById(R.id.txt_scope);
            this.hashTxt = (TextView) view.findViewById(R.id.txt_hash);
        }
    }
}
