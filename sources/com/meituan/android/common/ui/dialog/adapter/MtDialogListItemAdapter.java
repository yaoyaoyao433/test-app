package com.meituan.android.common.ui.dialog.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MtDialogListItemAdapter extends BaseAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context mContext;
    private List<CharSequence> mDataList;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public MtDialogListItemAdapter(Context context, CharSequence[] charSequenceArr) {
        this(context, Arrays.asList(charSequenceArr));
        Object[] objArr = {context, charSequenceArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "818a67847967bfbf758d88f9c8171d37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "818a67847967bfbf758d88f9c8171d37");
        }
    }

    public MtDialogListItemAdapter(Context context, List<CharSequence> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "093a57a9429238f20dba66dab15f9b64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "093a57a9429238f20dba66dab15f9b64");
            return;
        }
        this.mContext = context;
        this.mDataList = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d34a5710f3a5954b745644cdf08e27d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d34a5710f3a5954b745644cdf08e27d")).intValue() : this.mDataList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45d01aecfca417794b385741f9db6b4f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45d01aecfca417794b385741f9db6b4f") : this.mDataList.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9764559196ee9ca4b7358146b011cdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9764559196ee9ca4b7358146b011cdc");
        }
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.commonui_dialog_list_textview, (ViewGroup) null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (this.mDataList.get(i) != null) {
            viewHolder.mTextView.setText(this.mDataList.get(i));
        }
        return view;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public TextView mTextView;

        public ViewHolder(View view) {
            this.mTextView = (TextView) view.findViewById(R.id.text);
        }
    }
}
