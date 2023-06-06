package com.meituan.android.common.ui.dialog.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.android.common.ui.dialog.model.MtDialogOption;
import com.meituan.android.common.ui.dialog.model.MtDialogOptionWrapper;
import com.meituan.android.common.ui.utils.UIUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MtDialogCheckGroup extends ListView implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private OptionsAdapter mAdapter;
    private Context mContext;
    private MtDialogOptionWrapper mMtDialogOptionWrapper;
    private OnChangeListener mOnChangeListener;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnChangeListener {
        void onChange(AdapterView<?> adapterView, View view, int i);
    }

    public MtDialogCheckGroup(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33190f627b408ba223cf255bd4899810", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33190f627b408ba223cf255bd4899810");
            return;
        }
        this.mContext = context;
        setDivider(new ColorDrawable(0));
        setDividerHeight(UIUtil.dip2px(context, 12.0f));
        setOnItemClickListener(this);
        setVerticalScrollBarEnabled(false);
        this.mMtDialogOptionWrapper = new MtDialogOptionWrapper();
        this.mAdapter = new OptionsAdapter(this.mMtDialogOptionWrapper.getOptions());
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2d7a3226a6211021821691e0b8c100a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2d7a3226a6211021821691e0b8c100a");
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(UIUtil.dip2px(this.mContext, 264.0f), Integer.MIN_VALUE));
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdcd1d06e0f203747ea1ce924b942222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdcd1d06e0f203747ea1ce924b942222");
        } else if (this.mMtDialogOptionWrapper.isEnabled()) {
            if (this.mMtDialogOptionWrapper.isSingleChoice()) {
                handleSingleChoice(adapterView, view, i);
            } else {
                handleMultiChoice(view, i);
            }
            if (this.mOnChangeListener != null) {
                this.mOnChangeListener.onChange(adapterView, view, i);
            }
        }
    }

    private void handleSingleChoice(AdapterView<?> adapterView, View view, int i) {
        Object[] objArr = {adapterView, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6ac3693e9a832f52bb3e49fb46fab63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6ac3693e9a832f52bb3e49fb46fab63");
            return;
        }
        int childCount = adapterView.getChildCount();
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            CheckBox checkBox = (CheckBox) adapterView.getChildAt(i2).findViewById(R.id.checkbox);
            boolean isChecked = checkBox.isChecked();
            if (i2 == i && !isChecked) {
                checkBox.setChecked(true);
                this.mMtDialogOptionWrapper.getOptionAt(i2).setCheck(true);
                z = true;
            } else if (i2 != i && isChecked) {
                checkBox.setChecked(false);
                this.mMtDialogOptionWrapper.getOptionAt(i2).setCheck(false);
                break;
            }
            i2++;
        }
        if (z) {
            return;
        }
        ((CheckBox) view.findViewById(R.id.checkbox)).setChecked(true);
        this.mMtDialogOptionWrapper.getOptionAt(i).setCheck(true);
    }

    private void handleMultiChoice(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0a2e60bd2ac898620fb0f9d446145c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0a2e60bd2ac898620fb0f9d446145c8");
            return;
        }
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkbox);
        checkBox.setChecked(!checkBox.isChecked());
        this.mMtDialogOptionWrapper.getOptionAt(i).setCheck(true);
    }

    public void setOptionWrapper(MtDialogOptionWrapper mtDialogOptionWrapper) {
        Object[] objArr = {mtDialogOptionWrapper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed9de31fb0676c28142c86cbed5e6823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed9de31fb0676c28142c86cbed5e6823");
        } else if (mtDialogOptionWrapper == null) {
        } else {
            this.mMtDialogOptionWrapper.set(mtDialogOptionWrapper);
            setAdapter((ListAdapter) this.mAdapter);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class OptionsAdapter extends BaseAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<MtDialogOption> mMtDialogCheckOptions;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public OptionsAdapter(List<MtDialogOption> list) {
            Object[] objArr = {MtDialogCheckGroup.this, list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f8a8982fcc786623bf503800ad10541", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f8a8982fcc786623bf503800ad10541");
            } else {
                this.mMtDialogCheckOptions = list;
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e72e5e98e052ed6d1f2fd2ef734e8288", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e72e5e98e052ed6d1f2fd2ef734e8288")).intValue() : this.mMtDialogCheckOptions.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddbaa5628a0f8c89089ffdc511b24971", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddbaa5628a0f8c89089ffdc511b24971") : this.mMtDialogCheckOptions.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2c6715ffd385351eaf15d3be982f686", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2c6715ffd385351eaf15d3be982f686");
            }
            if (view == null) {
                view = LayoutInflater.from(MtDialogCheckGroup.this.mContext).inflate(R.layout.commonui_dialog_list_view, viewGroup, false);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            MtDialogOption mtDialogOption = this.mMtDialogCheckOptions.get(i);
            viewHolder.checkBox.setChecked(mtDialogOption.isCheck());
            viewHolder.textView.setText(mtDialogOption.getTitle());
            return view;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class ViewHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CheckBox checkBox;
        public TextView textView;

        public ViewHolder(View view) {
            this.checkBox = (CheckBox) view.findViewById(R.id.checkbox);
            this.textView = (TextView) view.findViewById(R.id.text);
        }
    }

    public void setOnChangeListener(OnChangeListener onChangeListener) {
        this.mOnChangeListener = onChangeListener;
    }
}
