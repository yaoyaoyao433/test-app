package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGCustomPriceFilter extends LinearLayout {
    public static ChangeQuickRedirect a;
    private EditText b;
    private EditText c;
    private boolean d;
    private a e;
    private InputMethodManager f;
    private TextWatcher g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, int i2);
    }

    public static /* synthetic */ boolean a(SGCustomPriceFilter sGCustomPriceFilter, boolean z) {
        sGCustomPriceFilter.d = true;
        return true;
    }

    public SGCustomPriceFilter(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0fe42a1cb9306f871570a55c386a29e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0fe42a1cb9306f871570a55c386a29e");
        }
    }

    public SGCustomPriceFilter(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a5317334aa01f59c0ce40289c40339c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a5317334aa01f59c0ce40289c40339c");
        }
    }

    public SGCustomPriceFilter(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2bdfa28dc0378ae4009752ee79e5bdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2bdfa28dc0378ae4009752ee79e5bdc");
        }
    }

    public SGCustomPriceFilter(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4049fb5e031a701d42bc8cb8e7524424", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4049fb5e031a701d42bc8cb8e7524424");
            return;
        }
        this.d = true;
        this.g = new TextWatcher() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.SGCustomPriceFilter.1
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f04c0533f78c6bc0fc3a58b586634946", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f04c0533f78c6bc0fc3a58b586634946");
                } else if (SGCustomPriceFilter.this.d) {
                    if (SGCustomPriceFilter.this.e != null) {
                        int maxPrice = SGCustomPriceFilter.this.getMaxPrice();
                        int minPrice = SGCustomPriceFilter.this.getMinPrice();
                        if (maxPrice != -1 && minPrice > maxPrice) {
                            minPrice = maxPrice;
                            maxPrice = minPrice;
                        }
                        if ((maxPrice == -1 && minPrice == -1) || (maxPrice != -1 && minPrice != -1)) {
                            SGCustomPriceFilter.this.e.a(minPrice, maxPrice);
                        } else if (maxPrice == -1) {
                            SGCustomPriceFilter.this.e.a(minPrice, 99999999);
                        } else {
                            SGCustomPriceFilter.this.e.a(0, maxPrice);
                        }
                    }
                } else {
                    SGCustomPriceFilter.a(SGCustomPriceFilter.this, true);
                }
            }
        };
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fe6106e43687c5d6d88de0ded6ab5ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fe6106e43687c5d6d88de0ded6ab5ae");
            return;
        }
        inflate(context, R.layout.wm_widget_filter_bar_filter_dialog_filter_custom_price_item, this);
        this.b = (EditText) findViewById(R.id.max_price);
        this.c = (EditText) findViewById(R.id.min_price);
        this.b.addTextChangedListener(this.g);
        this.c.addTextChangedListener(this.g);
        this.f = (InputMethodManager) context.getSystemService("input_method");
    }

    public void setEditTextBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9201af09fdf8a2c66cb8c4b8cdc557e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9201af09fdf8a2c66cb8c4b8cdc557e6");
            return;
        }
        this.b.setBackground(drawable);
        this.c.setBackground(drawable);
    }

    public void setEditTextBackgroundResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4f86bb54d4fdad783f31c2b0828867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4f86bb54d4fdad783f31c2b0828867");
            return;
        }
        this.b.setBackgroundResource(i);
        this.c.setBackgroundResource(i);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdbaa6cf68a9456286b54df10012b629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdbaa6cf68a9456286b54df10012b629");
            return;
        }
        clearFocus();
        if (this.f.isActive()) {
            this.f.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void setOnPriceChangeListener(a aVar) {
        this.e = aVar;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c58705bab014eed2cf3d5f7185670371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c58705bab014eed2cf3d5f7185670371");
            return;
        }
        setMinPrice(-1);
        setMaxPrice(-1);
    }

    public void setMinPrice(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a238247f1296b790bd68f1e6e5fa324f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a238247f1296b790bd68f1e6e5fa324f");
            return;
        }
        this.d = false;
        if (i == -1) {
            this.c.setText("");
        } else {
            this.c.setText(String.valueOf(i));
        }
    }

    public void setMaxPrice(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d3ebcb3de35d0f684670d5ffe5d9c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d3ebcb3de35d0f684670d5ffe5d9c9");
            return;
        }
        this.d = false;
        if (i == -1) {
            this.b.setText("");
        } else {
            this.b.setText(String.valueOf(i));
        }
    }

    public int getMaxPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31af43401368acf30626a59ba040027d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31af43401368acf30626a59ba040027d")).intValue();
        }
        String obj = this.b.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return -1;
        }
        try {
            return Integer.parseInt(obj);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int getMinPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c18338da00d30bf6b98dd10ac569f74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c18338da00d30bf6b98dd10ac569f74")).intValue();
        }
        String obj = this.c.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return -1;
        }
        try {
            return Integer.parseInt(obj);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
