package com.meituan.android.common.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.ui.dialog.adapter.MtDialogListItemAdapter;
import com.meituan.android.common.ui.dialog.model.MtCommonDialogParams;
import com.meituan.android.common.ui.dialog.model.MtDialogOptionWrapper;
import com.meituan.android.common.ui.dialog.view.MtDialogCheckGroup;
import com.meituan.android.common.ui.dialog.view.MtDialogMaxHeightListView;
import com.meituan.android.common.ui.utils.UIUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MtCommonDialog extends Dialog implements DialogInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MtCommonDialog(Context context) {
        this(context, R.style.MtDialogStyle);
    }

    public MtCommonDialog(Context context, int i) {
        super(context, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final MtCommonDialogParams P;
        private RelativeLayout mButtonContainer;
        private LinearLayout mContentLayout;
        private View mContentView;
        private boolean mIsSetContentView;
        private TextView mMessageView;
        private MtCommonDialog mMtCommonDialog;
        private Button mNegativeButton;
        private int mPaddingBottom;
        private int mPaddingTop;
        private Button mPositiveButton;
        private TextView mTitleView;

        public Builder(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df82c2a589f66d5687e262d56a93c98e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df82c2a589f66d5687e262d56a93c98e");
                return;
            }
            this.mIsSetContentView = false;
            this.mPaddingTop = 0;
            this.mPaddingBottom = 0;
            this.P = new MtCommonDialogParams(context);
            this.mContentView = LayoutInflater.from(context).inflate(R.layout.commonui_dialog_unified_layout, (ViewGroup) null);
            this.mMtCommonDialog = new MtCommonDialog(context);
            this.mMtCommonDialog.addContentView(this.mContentView, new LinearLayout.LayoutParams(UIUtil.dip2px(context, 280.0f), -2));
            this.mTitleView = (TextView) this.mContentView.findViewById(R.id.title);
            this.mPositiveButton = (Button) this.mContentView.findViewById(R.id.positive_button);
            this.mNegativeButton = (Button) this.mContentView.findViewById(R.id.negative_button);
            this.mMessageView = (TextView) this.mContentView.findViewById(R.id.message);
            this.mContentLayout = (LinearLayout) this.mContentView.findViewById(R.id.content);
            this.mButtonContainer = (RelativeLayout) this.mContentView.findViewById(R.id.button_container);
        }

        public Builder setTitle(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "587c40c966bfcc94ca45fd402a5889bd", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "587c40c966bfcc94ca45fd402a5889bd");
            }
            this.P.setTitle(i);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            Object[] objArr = {charSequence};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "759548c3767b3f47c077f60a99330421", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "759548c3767b3f47c077f60a99330421");
            }
            this.P.setTitle(charSequence);
            return this;
        }

        public Builder setMessage(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f6dd50ae7c4e9a773657257013f7d72", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f6dd50ae7c4e9a773657257013f7d72");
            }
            this.P.setMessage(i);
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            Object[] objArr = {charSequence};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28c839dbc790a9676c7692fa33e38d75", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28c839dbc790a9676c7692fa33e38d75");
            }
            this.P.setMessage(charSequence);
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "589661b172cd218869a9c233f04e2ad3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "589661b172cd218869a9c233f04e2ad3");
            }
            this.P.setPositiveButtonText(charSequence);
            this.P.setPositiveListener(onClickListener);
            return this;
        }

        public Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73e1b747784b6e8888e68455fc8273b9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73e1b747784b6e8888e68455fc8273b9");
            }
            this.P.setPositiveButtonText(i);
            this.P.setPositiveListener(onClickListener);
            return this;
        }

        public Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c090d8423786415a36f2abe23e95ff2", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c090d8423786415a36f2abe23e95ff2");
            }
            this.P.setNegativeButtonText(i);
            this.P.setNegativeListener(onClickListener);
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "060203dc6ce0ab5b535f90b1c88bcd90", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "060203dc6ce0ab5b535f90b1c88bcd90");
            }
            this.P.setNegativeButtonText(charSequence);
            this.P.setNegativeListener(onClickListener);
            return this;
        }

        public Builder setItems(int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9caec7863f1f1c810be0b38f002ede89", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9caec7863f1f1c810be0b38f002ede89") : setAdapter(new MtDialogListItemAdapter(this.P.getContext(), this.P.getContext().getResources().getStringArray(i)), onClickListener);
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequenceArr, onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad979ac4d4c2bf9566085c563dcf3913", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad979ac4d4c2bf9566085c563dcf3913") : setAdapter(new MtDialogListItemAdapter(this.P.getContext(), charSequenceArr), onClickListener);
        }

        public Builder setContentView(View view, boolean z) {
            Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "088b06e2ba7fe0250efad3f5ec551838", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "088b06e2ba7fe0250efad3f5ec551838");
            }
            if (this.P.getContext() == null) {
                return null;
            }
            if (view != null) {
                this.mContentLayout.removeAllViews();
                this.mContentLayout.addView(view);
                if (!(view instanceof ListView)) {
                    this.mPaddingTop += UIUtil.dip2px(this.P.getContext(), 16.0f);
                    this.mContentLayout.setPadding(0, this.mPaddingTop, 0, this.mPaddingBottom);
                }
                this.mIsSetContentView = true;
            }
            if (z) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                this.mContentLayout.setLayoutParams(layoutParams);
            }
            return this;
        }

        public Builder setView(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55f09934c05a2c70fd24cfc987cfcb56", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55f09934c05a2c70fd24cfc987cfcb56") : setContentView(view, true);
        }

        public Builder setView(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8889d8098b9dfdab65802a578e2e4f02", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8889d8098b9dfdab65802a578e2e4f02") : setContentView(LayoutInflater.from(this.P.getContext()).inflate(i, (ViewGroup) null), true);
        }

        private Builder setAdapter(ListAdapter listAdapter, final DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {listAdapter, onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f5a69edf8c248aba073ed78250869ba", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f5a69edf8c248aba073ed78250869ba");
            }
            if (this.P.getContext() == null) {
                return null;
            }
            MtDialogMaxHeightListView mtDialogMaxHeightListView = new MtDialogMaxHeightListView(this.P.getContext());
            mtDialogMaxHeightListView.addHeaderView(new ViewStub(this.P.getContext()));
            mtDialogMaxHeightListView.addFooterView(new ViewStub(this.P.getContext()));
            mtDialogMaxHeightListView.setHeaderDividersEnabled(true);
            mtDialogMaxHeightListView.setFooterDividersEnabled(true);
            mtDialogMaxHeightListView.setDivider(new ColorDrawable(-437918235));
            mtDialogMaxHeightListView.setDividerHeight(UIUtil.dip2px(this.P.getContext(), 0.5f));
            mtDialogMaxHeightListView.setVerticalScrollBarEnabled(false);
            mtDialogMaxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.meituan.android.common.ui.dialog.MtCommonDialog.Builder.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    Object[] objArr2 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7f30307c842e7f5b55e5bdd8c7331dda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7f30307c842e7f5b55e5bdd8c7331dda");
                    } else if (onClickListener == null) {
                        Builder.this.mMtCommonDialog.dismiss();
                    } else {
                        onClickListener.onClick(Builder.this.mMtCommonDialog, i);
                    }
                }
            });
            mtDialogMaxHeightListView.setAdapter(listAdapter);
            setContentView(mtDialogMaxHeightListView, false);
            return this;
        }

        public Builder setSingleChoiceItems(int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0473ccaab61efa2c5c01029a8fea4fdb", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0473ccaab61efa2c5c01029a8fea4fdb") : setSingleChoiceItems(i, 0, onClickListener);
        }

        public Builder setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f2da5089b37612c5023428ca0c89a13", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f2da5089b37612c5023428ca0c89a13") : setSingleChoiceItems(this.P.getContext().getResources().getStringArray(i), i2, onClickListener);
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequenceArr, onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2669cb95e40e32b8e3bed36d88e4e5e", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2669cb95e40e32b8e3bed36d88e4e5e") : setSingleChoiceItems(charSequenceArr, 0, onClickListener);
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequenceArr, Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7fad27ef81f99d653cce8d564b63b70", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7fad27ef81f99d653cce8d564b63b70") : setSingleChoiceItems(Arrays.asList(charSequenceArr), i, onClickListener);
        }

        private Builder setSingleChoiceItems(List<CharSequence> list, int i, final DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {list, Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "542a91af9bb986521ef8a94ce914a4c6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "542a91af9bb986521ef8a94ce914a4c6");
            }
            MtDialogOptionWrapper mtDialogOptionWrapper = new MtDialogOptionWrapper(true);
            mtDialogOptionWrapper.setOptions(list);
            mtDialogOptionWrapper.setChecked(i);
            MtDialogCheckGroup mtDialogCheckGroup = new MtDialogCheckGroup(this.P.getContext());
            mtDialogCheckGroup.setOptionWrapper(mtDialogOptionWrapper);
            mtDialogCheckGroup.setOnChangeListener(new MtDialogCheckGroup.OnChangeListener() { // from class: com.meituan.android.common.ui.dialog.MtCommonDialog.Builder.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.ui.dialog.view.MtDialogCheckGroup.OnChangeListener
                public void onChange(AdapterView<?> adapterView, View view, int i2) {
                    Object[] objArr2 = {adapterView, view, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25a5b98fa895643d9515c8f49c32bfeb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25a5b98fa895643d9515c8f49c32bfeb");
                    } else if (onClickListener == null) {
                    } else {
                        onClickListener.onClick(Builder.this.mMtCommonDialog, i2);
                    }
                }
            });
            setContentView(mtDialogCheckGroup, false);
            return this;
        }

        public Builder setMultiChoiceItems(int i, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            Object[] objArr = {Integer.valueOf(i), onMultiChoiceClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3b93fa74fd0c0c0070395c99a246152", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3b93fa74fd0c0c0070395c99a246152") : setMultiChoiceItems(i, (int[]) null, onMultiChoiceClickListener);
        }

        public Builder setMultiChoiceItems(int i, int[] iArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            Object[] objArr = {Integer.valueOf(i), iArr, onMultiChoiceClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91719856d6e030756fd2d695c3d24277", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91719856d6e030756fd2d695c3d24277") : setMultiChoiceItems(this.P.getContext().getResources().getStringArray(i), iArr, onMultiChoiceClickListener);
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            Object[] objArr = {charSequenceArr, onMultiChoiceClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "253c2ea9a4647b73d82cca5b7758f7fa", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "253c2ea9a4647b73d82cca5b7758f7fa") : setMultiChoiceItems(charSequenceArr, (int[]) null, onMultiChoiceClickListener);
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, int[] iArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            Object[] objArr = {charSequenceArr, iArr, onMultiChoiceClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39628e59c4a84b601767b666ec7b5f58", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39628e59c4a84b601767b666ec7b5f58") : setMultiChoiceItems(Arrays.asList(charSequenceArr), iArr, onMultiChoiceClickListener);
        }

        private Builder setMultiChoiceItems(List<CharSequence> list, int[] iArr, final DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            Object[] objArr = {list, iArr, onMultiChoiceClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7236cf5a9ce5f74fe09be449f22f6d6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7236cf5a9ce5f74fe09be449f22f6d6");
            }
            MtDialogOptionWrapper mtDialogOptionWrapper = new MtDialogOptionWrapper(false);
            mtDialogOptionWrapper.setOptions(list);
            mtDialogOptionWrapper.setChecked(iArr);
            MtDialogCheckGroup mtDialogCheckGroup = new MtDialogCheckGroup(this.P.getContext());
            mtDialogCheckGroup.setOptionWrapper(mtDialogOptionWrapper);
            mtDialogCheckGroup.setOnChangeListener(new MtDialogCheckGroup.OnChangeListener() { // from class: com.meituan.android.common.ui.dialog.MtCommonDialog.Builder.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.ui.dialog.view.MtDialogCheckGroup.OnChangeListener
                public void onChange(AdapterView<?> adapterView, View view, int i) {
                    Object[] objArr2 = {adapterView, view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b8de2025d4081ea1b1ff285832912cd1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b8de2025d4081ea1b1ff285832912cd1");
                    } else if (onMultiChoiceClickListener == null) {
                    } else {
                        onMultiChoiceClickListener.onClick(Builder.this.mMtCommonDialog, i, ((CheckBox) view.findViewById(R.id.checkbox)).isChecked());
                    }
                }
            });
            setContentView(mtDialogCheckGroup, false);
            return this;
        }

        public MtCommonDialog create() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7da54cc1b5fe4bd35886563b5a125d1", RobustBitConfig.DEFAULT_VALUE)) {
                return (MtCommonDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7da54cc1b5fe4bd35886563b5a125d1");
            }
            if (this.P.getContext() == null) {
                return null;
            }
            setText(this.P.getTitle(), this.mTitleView);
            setText(this.P.getMessage(), this.mMessageView);
            setText(this.P.getPositiveButtonText(), this.mPositiveButton, this.P.getPositiveListener());
            setText(this.P.getNegativeButtonText(), this.mNegativeButton, this.P.getNegativeListener());
            if (!this.P.haveButton()) {
                this.mButtonContainer.setVisibility(8);
                this.mPaddingBottom += UIUtil.dip2px(this.P.getContext(), 16.0f);
                this.mContentLayout.setPadding(0, this.mPaddingTop, 0, this.mPaddingBottom);
            }
            if (!this.mIsSetContentView && TextUtils.isEmpty(this.P.getMessage())) {
                this.mContentLayout.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.P.getTitle())) {
                this.mPaddingTop += UIUtil.dip2px(this.P.getContext(), 16.0f);
                this.mContentLayout.setPadding(0, this.mPaddingTop, 0, this.mPaddingBottom);
            }
            return this.mMtCommonDialog;
        }

        public void setText(CharSequence charSequence, TextView textView) {
            Object[] objArr = {charSequence, textView};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8abbbfb5cfe37cdb35e60eb927ed4074", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8abbbfb5cfe37cdb35e60eb927ed4074");
            } else {
                setText(charSequence, textView, null);
            }
        }

        public void setText(CharSequence charSequence, TextView textView, final DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {charSequence, textView, onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "960c1cbad731cfce09518bb577066a44", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "960c1cbad731cfce09518bb577066a44");
            } else if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                if (textView instanceof Button) {
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.common.ui.dialog.MtCommonDialog.Builder.4
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            int i = 0;
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "906103a3be5a4c24f6606082cd1edb4b", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "906103a3be5a4c24f6606082cd1edb4b");
                                return;
                            }
                            if (view == Builder.this.mPositiveButton) {
                                i = -1;
                            } else if (view == Builder.this.mNegativeButton) {
                                i = -2;
                            }
                            if (onClickListener == null) {
                                Builder.this.mMtCommonDialog.dismiss();
                            } else {
                                onClickListener.onClick(Builder.this.mMtCommonDialog, i);
                            }
                        }
                    });
                }
            }
        }

        public Builder setCanceledOnTouchOutside(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6417ec4b59cf1cafbab372aa2ac48662", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6417ec4b59cf1cafbab372aa2ac48662");
            }
            this.mMtCommonDialog.setCanceledOnTouchOutside(z);
            return this;
        }

        public Builder setCancelable(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "194f48ab720fc24bbaa429ed8fcc79d2", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "194f48ab720fc24bbaa429ed8fcc79d2");
            }
            this.mMtCommonDialog.setCancelable(z);
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            Object[] objArr = {onDismissListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7174c806926cd38e352ccf5a6d4cbb78", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7174c806926cd38e352ccf5a6d4cbb78");
            }
            this.mMtCommonDialog.setOnDismissListener(onDismissListener);
            return this;
        }

        public Button getButton(int i) {
            switch (i) {
                case -2:
                    return this.mPositiveButton;
                case -1:
                    return this.mPositiveButton;
                default:
                    return null;
            }
        }
    }
}
