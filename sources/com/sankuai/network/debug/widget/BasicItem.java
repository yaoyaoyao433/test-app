package com.sankuai.network.debug.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.support.constraint.R;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BasicItem extends LinearLayout {
    public static ChangeQuickRedirect a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    public Spanned b;
    private Context c;
    private LinearLayout d;
    private TextView e;
    private TextView f;
    private EditText g;
    private TextView h;
    private CheckBox i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private String o;
    private String p;
    private String q;
    private String r;
    private int s;
    private String t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    public BasicItem(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e74616665c8d485c052139abbf7b72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e74616665c8d485c052139abbf7b72");
            return;
        }
        this.c = context;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public BasicItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6fd583efe662c310f6ad2455b3ef85a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6fd583efe662c310f6ad2455b3ef85a");
            return;
        }
        this.c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.sk_network_dptitle, R.attr.sk_network_subTitle, R.attr.sk_network_input, R.attr.sk_network_input_hint, R.attr.sk_network_input_type, R.attr.sk_network_input_maxLength, R.attr.sk_network_count, R.attr.sk_network_checked, R.attr.sk_network_clickable, R.attr.sk_network_show1stPic, R.attr.sk_network_show2ndPic, R.attr.sk_network_title_textType, R.attr.sk_network_subTitle_textType, R.attr.sk_network_count_textType, R.attr.sk_network_input_textType, R.attr.sk_network_right1stPic, R.attr.sk_network_right2ndPic, R.attr.sk_network_arrowImage});
        this.o = obtainStyledAttributes.getString(0);
        this.p = obtainStyledAttributes.getString(1);
        this.q = obtainStyledAttributes.getString(2);
        this.r = obtainStyledAttributes.getString(3);
        this.s = obtainStyledAttributes.getInt(4, 1);
        this.t = obtainStyledAttributes.getString(6);
        this.u = obtainStyledAttributes.getInt(7, 0);
        this.y = obtainStyledAttributes.getInt(11, 0);
        this.z = obtainStyledAttributes.getInt(12, 0);
        this.A = obtainStyledAttributes.getInt(13, 0);
        this.B = obtainStyledAttributes.getInt(14, 0);
        this.v = obtainStyledAttributes.getBoolean(8, false);
        this.C = obtainStyledAttributes.getResourceId(17, 0);
        this.D = obtainStyledAttributes.getResourceId(15, 0);
        this.w = obtainStyledAttributes.getBoolean(9, false);
        this.E = obtainStyledAttributes.getResourceId(16, 0);
        this.x = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            return;
        }
        setupView(context);
    }

    private void setupView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "493aad1bb49a978be679cc868fc7d39d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "493aad1bb49a978be679cc868fc7d39d");
            return;
        }
        Resources resources = context.getResources();
        ColorStateList colorStateList = resources.getColorStateList(R.color.sk_network_text_color_default);
        this.d = new LinearLayout(context);
        this.d.setDuplicateParentStateEnabled(true);
        this.d.setGravity(16);
        this.e = new TextView(context);
        this.e.setId(R.id.sk_network_itemTitle);
        this.e.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.e.setText(this.o);
        this.e.setDuplicateParentStateEnabled(true);
        this.e.setTextAppearance(context, 16973892);
        this.e.setTextColor(colorStateList);
        this.e.setSingleLine(true);
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        this.e.setPadding(0, 0, a(10.0f), 0);
        this.e.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        a(this.e, this.y);
        this.d.addView(this.e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a(30.0f), a(30.0f));
        layoutParams.setMargins(0, 0, a(10.0f), 0);
        this.j = new ImageView(context);
        this.j.setId(R.id.sk_network_itemRight1stPic);
        this.j.setLayoutParams(layoutParams);
        this.j.setDuplicateParentStateEnabled(true);
        this.d.addView(this.j);
        this.k = new ImageView(context);
        this.k.setId(R.id.sk_network_itemRight2ndPic);
        this.k.setLayoutParams(layoutParams);
        this.k.setDuplicateParentStateEnabled(true);
        this.d.addView(this.k);
        this.f = new TextView(context);
        this.f.setId(R.id.sk_network_itemSubTitle);
        this.f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f.setText(this.p);
        this.f.setDuplicateParentStateEnabled(true);
        this.f.setTextAppearance(context, 16973892);
        this.f.setTextColor(colorStateList);
        this.f.setSingleLine(true);
        this.f.setEllipsize(TextUtils.TruncateAt.END);
        a(this.f, this.z);
        this.d.addView(this.f);
        addView(this.d);
        this.g = new EditText(context);
        this.g.setId(R.id.sk_network_itemInput);
        this.g.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.g.setGravity(16);
        this.g.setText(this.q);
        this.g.setDuplicateParentStateEnabled(true);
        this.g.setTextAppearance(context, 16973892);
        this.g.setTextColor(colorStateList);
        this.g.setSingleLine(true);
        this.g.setEllipsize(TextUtils.TruncateAt.END);
        this.g.setHint(this.r);
        this.g.setInputType(this.s);
        this.g.setBackgroundDrawable(null);
        this.g.setPadding(0, 0, 0, 0);
        a(this.g, this.B);
        addView(this.g);
        this.h = new TextView(context);
        this.h.setId(R.id.sk_network_itemCount);
        this.h.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.h.setText(this.t);
        this.h.setMaxWidth(a(180.0f));
        this.h.setDuplicateParentStateEnabled(true);
        this.h.setTextAppearance(context, 16973892);
        this.h.setTextColor(resources.getColorStateList(R.color.debug_text_gray_color_selector));
        this.h.setPadding(0, 0, 0, 0);
        a(this.h, this.A);
        addView(this.h);
        this.i = new CheckBox(context);
        this.i.setId(R.id.sk_network_itemCheckBox);
        this.i.setLayoutParams(new LinearLayout.LayoutParams(a(26.0f), a(25.0f)));
        this.i.setChecked(this.u == 1);
        this.i.setPadding(0, 0, 0, 0);
        addView(this.i);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a(30.0f), a(30.0f));
        layoutParams2.setMargins(a(10.0f), 0, 0, 0);
        this.l = new ImageView(context);
        this.l.setId(R.id.sk_network_itemRight1stPic);
        this.l.setLayoutParams(layoutParams2);
        this.l.setDuplicateParentStateEnabled(true);
        if (this.D != 0) {
            this.l.setImageResource(this.D);
        } else {
            this.l.setImageResource(0);
        }
        addView(this.l);
        this.m = new ImageView(context);
        this.m.setId(R.id.sk_network_itemRight2ndPic);
        this.m.setLayoutParams(layoutParams2);
        this.m.setDuplicateParentStateEnabled(true);
        if (this.E != 0) {
            this.m.setImageResource(this.E);
        } else {
            this.m.setImageResource(0);
        }
        addView(this.m);
        this.n = new ImageView(context);
        this.n.setId(R.id.sk_network_itemArrow);
        this.n.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.n.setPadding(a(10.0f), 0, 0, 0);
        this.n.setDuplicateParentStateEnabled(true);
        if (this.C != 0) {
            this.n.setImageResource(this.C);
        } else {
            this.n.setImageResource(R.drawable.arrow);
        }
        addView(this.n);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1aa85b60ea6225ce2d1967eb730800f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1aa85b60ea6225ce2d1967eb730800f");
        } else {
            this.e.setVisibility(this.o == null ? 8 : 0);
            this.f.setVisibility(this.p == null ? 8 : 0);
            this.g.setVisibility((this.r == null && this.q == null) ? 8 : 0);
            this.h.setVisibility(this.t != null ? 0 : 8);
            this.i.setVisibility(this.u == 0 ? 8 : 0);
            this.l.setVisibility(this.w ? 0 : 8);
            this.m.setVisibility(this.x ? 0 : 8);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
            this.n.setVisibility(isClickable() ? 0 : 8);
            if (this.r != null || this.q != null) {
                this.d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0f));
            } else {
                this.d.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            }
            if (this.r != null || this.p != null) {
                this.y |= 4;
            }
            a(this.e, this.y);
            setClickable(this.v);
        }
        setGravity(16);
        setMinimumHeight(a(45.0f));
    }

    private int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad718b302546960104de8f1d854fef22", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad718b302546960104de8f1d854fef22")).intValue() : (int) ((f * this.c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void a(TextView textView, int i) {
        Object[] objArr = {textView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db1a800273b9396864a2181d983975ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db1a800273b9396864a2181d983975ea");
            return;
        }
        Resources resources = this.c.getResources();
        if (i == 0) {
            return;
        }
        if ((i & 1) == 1) {
            textView.setTextAppearance(this.c, R.style.sk_network_content_page_small_text);
        }
        if ((i & 2) == 2) {
            textView.setTextColor(resources.getColorStateList(R.color.debug_text_yellow_color_selector));
        }
        if ((i & 4) == 4) {
            textView.setTextColor(resources.getColorStateList(R.color.debug_text_gray_color_selector));
        }
        if ((i & 8) == 8) {
            textView.setTextColor(resources.getColorStateList(R.color.sk_network_black));
        }
        if ((i & 16) == 16) {
            textView.getPaint().setFakeBoldText(true);
        } else {
            textView.getPaint().setFakeBoldText(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5e02155669bb70666e09933126af452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5e02155669bb70666e09933126af452");
            return;
        }
        int id = R.id.sk_network_itemInput - getId();
        EditText editText = (EditText) findViewById(R.id.sk_network_itemInput);
        if (editText == null) {
            super.dispatchSaveInstanceState(sparseArray);
            return;
        }
        Parcelable onSaveInstanceState = editText.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            sparseArray.put(id, onSaveInstanceState);
        }
        int id2 = getId() ^ R.id.sk_network_itemCheckBox;
        Parcelable onSaveInstanceState2 = ((CheckBox) findViewById(R.id.sk_network_itemCheckBox)).onSaveInstanceState();
        if (onSaveInstanceState2 != null) {
            sparseArray.put(id2, onSaveInstanceState2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6c9bb41e79e45c513f30b1e0573fa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6c9bb41e79e45c513f30b1e0573fa9");
            return;
        }
        int id = R.id.sk_network_itemInput - getId();
        EditText editText = (EditText) findViewById(R.id.sk_network_itemInput);
        if (editText == null) {
            super.dispatchRestoreInstanceState(sparseArray);
            return;
        }
        Parcelable parcelable = sparseArray.get(id);
        if (parcelable != null) {
            editText.onRestoreInstanceState(parcelable);
        }
        int id2 = getId() ^ R.id.sk_network_itemCheckBox;
        CheckBox checkBox = (CheckBox) findViewById(R.id.sk_network_itemCheckBox);
        Parcelable parcelable2 = sparseArray.get(id2);
        if (parcelable2 != null) {
            checkBox.onRestoreInstanceState(parcelable2);
        }
    }

    @Override // android.view.View
    public boolean isClickable() {
        return this.v;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4035f1ac216a028a820735750b2fefa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4035f1ac216a028a820735750b2fefa3");
            return;
        }
        super.setClickable(z);
        this.v = z;
    }

    public String getInputHint() {
        return this.r;
    }

    public void setHint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7224fb169c1311ea6c8e666b107e275a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7224fb169c1311ea6c8e666b107e275a");
            return;
        }
        this.r = str;
        this.g.setHint(str);
    }

    public String getInputText() {
        return this.q;
    }

    public void setInputText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dece9c9cb3bdf61d8f8096490cd050da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dece9c9cb3bdf61d8f8096490cd050da");
            return;
        }
        this.q = str;
        this.g.setText(str);
    }

    public String getTitle() {
        return this.o;
    }

    public void setTitle(Spanned spanned) {
        Object[] objArr = {spanned};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc11bc31dbbd1e35119422fee4f01426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc11bc31dbbd1e35119422fee4f01426");
            return;
        }
        this.b = spanned;
        this.e.setText(spanned);
    }

    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e2197ad76cd41566c73e054730d185a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e2197ad76cd41566c73e054730d185a");
            return;
        }
        this.o = str;
        this.e.setText(str);
    }

    public String getSubTitle() {
        return this.p;
    }

    public void setSubTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "103ee210fe59a6a5c8afdb2dcb5e35a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "103ee210fe59a6a5c8afdb2dcb5e35a5");
            return;
        }
        this.p = str;
        this.f.setText(str);
    }

    public String getCount() {
        return this.t;
    }

    public void setCount(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b93fafbab82dc7189a542e22416b321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b93fafbab82dc7189a542e22416b321");
            return;
        }
        this.t = str;
        this.h.setText(str);
    }

    public int getInputType() {
        return this.s;
    }

    public void setInputType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bbe34e8f6528aef358f337e9bcdf25d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bbe34e8f6528aef358f337e9bcdf25d");
            return;
        }
        this.s = i;
        this.g.setInputType(i);
    }

    public int getTitleTextType() {
        return this.y;
    }

    public void setTitleTextType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0c1fcf7028081860986731d6178b26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0c1fcf7028081860986731d6178b26");
            return;
        }
        this.y = i;
        a(this.e, i);
    }

    public int getSubTitleTextType() {
        return this.z;
    }

    public void setSubTitleTextType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd226cad3d2f23943f63bbf458e4366f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd226cad3d2f23943f63bbf458e4366f");
            return;
        }
        this.z = i;
        a(this.f, i);
    }

    public int getCountTextType() {
        return this.A;
    }

    public void setCountTextType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdfa736899ce5939c0f1ea223b2fe077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdfa736899ce5939c0f1ea223b2fe077");
            return;
        }
        this.A = i;
        a(this.h, i);
    }

    public int getInputTextType() {
        return this.B;
    }

    public void setInputTextType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47fdb3a0ccd9b28752f08665753f05b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47fdb3a0ccd9b28752f08665753f05b0");
            return;
        }
        this.B = i;
        a(this.g, i);
    }

    public LinearLayout getItemTitleLay() {
        return this.d;
    }

    public TextView getItemTitle() {
        return this.e;
    }

    public TextView getItemSubtitle() {
        return this.f;
    }

    public EditText getItemInput() {
        return this.g;
    }

    public TextView getItemCount() {
        return this.h;
    }

    public CheckBox getItemCheckBox() {
        return this.i;
    }

    public ImageView getItemArrow() {
        return this.n;
    }

    public ImageView getItemLeft1stPic() {
        return this.j;
    }

    public ImageView getItemLeft2ndPic() {
        return this.k;
    }

    public ImageView getItemRight1stPic() {
        return this.l;
    }

    public ImageView getItemRight2ndPic() {
        return this.m;
    }

    public void setArrowImage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34951ef2000fd53d33103e724b07d85f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34951ef2000fd53d33103e724b07d85f");
        } else {
            this.n.setImageResource(i);
        }
    }
}
