package com.hhmedic.android.sdk.uikit.widget.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.hhmedic.android.sdk.uikit.utils.HHDisplayHelper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHUIBottomSheet extends HHBottomDialog {
    @Override // com.hhmedic.android.sdk.uikit.widget.dialog.HHBottomDialog
    protected void initUI() {
    }

    public HHUIBottomSheet(Context context) {
        super(context);
    }

    @Override // android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        this.mContentView = view;
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setContentView(@NonNull View view) {
        this.mContentView = view;
        super.setContentView(view);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class BottomListSheetBuilder {
        private final Context mContext;
        private HHUIBottomSheet mDialog;
        private final List<BottomSheetListItemData> mItems;
        private OnSheetItemClickListener mOnSheetItemClickListener;

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        public interface OnSheetItemClickListener {
            void onClick(HHUIBottomSheet hHUIBottomSheet, View view, int i, String str);
        }

        protected int getContentViewLayoutId() {
            return R.layout.hh_bottom_sheet_list;
        }

        public BottomListSheetBuilder(Context context) {
            this(context, false);
        }

        public BottomListSheetBuilder(Context context, boolean z) {
            this.mContext = context;
            this.mItems = new ArrayList();
        }

        public BottomListSheetBuilder addItem(String str) {
            this.mItems.add(new BottomSheetListItemData(str, str));
            return this;
        }

        public BottomListSheetBuilder setOnSheetItemClickListener(OnSheetItemClickListener onSheetItemClickListener) {
            this.mOnSheetItemClickListener = onSheetItemClickListener;
            return this;
        }

        public HHUIBottomSheet build() {
            this.mDialog = new HHUIBottomSheet(this.mContext);
            this.mDialog.setContentView(buildViews(), new ViewGroup.LayoutParams(-1, -2));
            return this.mDialog;
        }

        private View buildViews() {
            View inflate = View.inflate(this.mContext, getContentViewLayoutId(), null);
            ListView listView = (ListView) inflate.findViewById(R.id.listview);
            ((TextView) inflate.findViewById(R.id.hh_sdk_title)).setVisibility(8);
            if (needToScroll()) {
                listView.getLayoutParams().height = getListMaxHeight();
            }
            listView.setAdapter((android.widget.ListAdapter) new ListAdapter());
            return inflate;
        }

        private boolean needToScroll() {
            return this.mItems.size() * this.mContext.getResources().getDimensionPixelSize(R.dimen.hh_bottom_sheet_list_item_height) > getListMaxHeight();
        }

        protected int getListMaxHeight() {
            return (int) (HHDisplayHelper.getScreenHeight(this.mContext) * 0.5d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        public static class BottomSheetListItemData {
            boolean hasRedPoint = false;
            boolean isDisabled = false;
            String tag;
            String text;

            public BottomSheetListItemData(String str, String str2) {
                this.tag = "";
                this.text = str;
                this.tag = str2;
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        static class ViewHolder {
            TextView textView;

            private ViewHolder() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        public class ListAdapter extends BaseAdapter {
            @Override // android.widget.Adapter
            public long getItemId(int i) {
                return 0L;
            }

            private ListAdapter() {
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return BottomListSheetBuilder.this.mItems.size();
            }

            @Override // android.widget.Adapter
            public BottomSheetListItemData getItem(int i) {
                return (BottomSheetListItemData) BottomListSheetBuilder.this.mItems.get(i);
            }

            @Override // android.widget.Adapter
            public View getView(final int i, View view, ViewGroup viewGroup) {
                ViewHolder viewHolder;
                final BottomSheetListItemData item = getItem(i);
                if (view == null) {
                    view = LayoutInflater.from(BottomListSheetBuilder.this.mContext).inflate(R.layout.hh_bottom_sheet_list_item, viewGroup, false);
                    viewHolder = new ViewHolder();
                    viewHolder.textView = (TextView) view.findViewById(R.id.hh_bottom_dialog_list_item_title);
                    view.setTag(viewHolder);
                } else {
                    viewHolder = (ViewHolder) view.getTag();
                }
                viewHolder.textView.setText(item.text);
                if (item.isDisabled) {
                    viewHolder.textView.setEnabled(false);
                    view.setEnabled(false);
                } else {
                    viewHolder.textView.setEnabled(true);
                    view.setEnabled(true);
                }
                view.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.uikit.widget.dialog.HHUIBottomSheet.BottomListSheetBuilder.ListAdapter.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (item.hasRedPoint) {
                            item.hasRedPoint = false;
                        }
                        if (BottomListSheetBuilder.this.mOnSheetItemClickListener != null) {
                            BottomListSheetBuilder.this.mOnSheetItemClickListener.onClick(BottomListSheetBuilder.this.mDialog, view2, i, item.tag);
                        }
                    }
                });
                return view;
            }
        }
    }
}
