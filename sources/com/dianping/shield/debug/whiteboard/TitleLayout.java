package com.dianping.shield.debug.whiteboard;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitleLayout extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextView addView;
    private ImageView keySortImage;
    private LinearLayout keySortView;
    private List<TextView> textViewList;
    private ImageView typeSortImage;
    private LinearLayout typeSortView;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum SortRule {
        KEY,
        TYPE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        SortRule() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dac4b18ddea22dd02e68c9610ab68b31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dac4b18ddea22dd02e68c9610ab68b31");
            }
        }

        public static SortRule valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8ebc42960001390425f6f71a4b12264", RobustBitConfig.DEFAULT_VALUE) ? (SortRule) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8ebc42960001390425f6f71a4b12264") : (SortRule) Enum.valueOf(SortRule.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SortRule[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53b1d5fff733a628434dfa0bfba99cb8", RobustBitConfig.DEFAULT_VALUE) ? (SortRule[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53b1d5fff733a628434dfa0bfba99cb8") : (SortRule[]) values().clone();
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "172e015e41537191e026c6872a115d40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "172e015e41537191e026c6872a115d40");
        } else {
            this.addView.setOnClickListener(onClickListener);
        }
    }

    public void setKeySortOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69d63234b1580778fcb0ba472cf2be91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69d63234b1580778fcb0ba472cf2be91");
        } else {
            this.keySortView.setOnClickListener(onClickListener);
        }
    }

    public void setTypeSortOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9900bbdf126f3df9408f235dc54afb9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9900bbdf126f3df9408f235dc54afb9e");
        } else {
            this.typeSortView.setOnClickListener(onClickListener);
        }
    }

    public TitleLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa708f34ea2a2fe568296885830f86da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa708f34ea2a2fe568296885830f86da");
        } else {
            initView();
        }
    }

    public TitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cdb39f9d86edd07765104defe1a28ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cdb39f9d86edd07765104defe1a28ae");
        } else {
            initView();
        }
    }

    public TitleLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab6e61ae68991dbc2729121595009f1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab6e61ae68991dbc2729121595009f1b");
        } else {
            initView();
        }
    }

    @TargetApi(21)
    public TitleLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51152825a4bcc4f1b6498f65c6b59505", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51152825a4bcc4f1b6498f65c6b59505");
        } else {
            initView();
        }
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de1bff3417b8c9f038f0d78424822494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de1bff3417b8c9f038f0d78424822494");
            return;
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.setMargins(30, 40, 30, 40);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(3);
        textView.setText("WhiteBoard");
        textView.setTextColor(Color.parseColor("#FF6633"));
        textView.setTextSize(2, 20.0f);
        addView(textView);
        this.addView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(30, 30, 30, 30);
        this.addView.setLayoutParams(layoutParams2);
        this.addView.setGravity(17);
        this.addView.setText("Add");
        addView(this.addView);
        this.textViewList = new ArrayList();
        this.keySortView = new LinearLayout(getContext());
        this.keySortView.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.setMargins(30, 30, 30, 30);
        layoutParams3.gravity = 16;
        addView(this.keySortView, layoutParams3);
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 16;
        layoutParams4.rightMargin = 20;
        textView2.setText("Key");
        this.keySortView.addView(textView2, layoutParams4);
        this.textViewList.add(textView2);
        this.keySortImage = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(30, 30);
        layoutParams5.gravity = 16;
        setSortASC(SortRule.KEY);
        this.keySortView.addView(this.keySortImage, layoutParams5);
        this.typeSortView = new LinearLayout(getContext());
        this.typeSortView.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams6.setMargins(30, 30, 30, 30);
        layoutParams6.gravity = 16;
        addView(this.typeSortView, layoutParams6);
        TextView textView3 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 16;
        layoutParams7.rightMargin = 20;
        textView3.setText("Type");
        this.typeSortView.addView(textView3, layoutParams7);
        this.textViewList.add(textView3);
        this.typeSortImage = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(30, 30);
        layoutParams8.gravity = 16;
        setSortASC(SortRule.TYPE);
        this.typeSortView.addView(this.typeSortImage, layoutParams8);
    }

    public void setSortASC(SortRule sortRule) {
        Object[] objArr = {sortRule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a669fc910dd11f10c1445db50ea176b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a669fc910dd11f10c1445db50ea176b5");
        } else if (sortRule == SortRule.KEY) {
            setBaseSortASC(this.keySortImage);
            setSortFocus(0);
        } else if (sortRule == SortRule.TYPE) {
            setBaseSortASC(this.typeSortImage);
            setSortFocus(1);
        }
    }

    public void setSortDESC(SortRule sortRule) {
        Object[] objArr = {sortRule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea81f91adfaa8a519dd3bcde6f097747", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea81f91adfaa8a519dd3bcde6f097747");
        } else if (sortRule == SortRule.KEY) {
            setBaseSortDESC(this.keySortImage);
            setSortFocus(0);
        } else if (sortRule == SortRule.TYPE) {
            setBaseSortDESC(this.typeSortImage);
            setSortFocus(1);
        }
    }

    public void setBaseSortASC(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d74fa25432211aacab32d440af96b927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d74fa25432211aacab32d440af96b927");
            return;
        }
        imageView.setImageResource(R.drawable.shield_not_fold_arrow);
        imageView.setTag("ASC");
    }

    public void setBaseSortDESC(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "003b34091e23e2dc45c5e4b9c71dcbee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "003b34091e23e2dc45c5e4b9c71dcbee");
            return;
        }
        imageView.setImageResource(R.drawable.shield_fold_arrow);
        imageView.setTag("DESC");
    }

    public void setSortFocus(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7858a3763c704cccf73fd3af37ad4bc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7858a3763c704cccf73fd3af37ad4bc7");
            return;
        }
        while (i2 < this.textViewList.size()) {
            this.textViewList.get(i2).setTextColor(Color.parseColor(i2 == i ? "#FF6633" : DiagnoseLog.COLOR_ERROR));
            i2++;
        }
    }

    public boolean isEqualSortTag(SortRule sortRule, String str) {
        Object[] objArr = {sortRule, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e32ac1c1b7bbe16c2ec517f68fba75da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e32ac1c1b7bbe16c2ec517f68fba75da")).booleanValue();
        }
        if (sortRule == SortRule.KEY) {
            return this.keySortImage.getTag().equals(str);
        }
        return this.typeSortImage.getTag().equals(str);
    }
}
