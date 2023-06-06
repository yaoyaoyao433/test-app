package com.sankuai.waimai.bussiness.order.comment.rn;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.HorizontalFlowLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class InputBoardBlock extends View {
    public static ChangeQuickRedirect a;
    private Activity b;
    private InputMethodManager c;
    private SharedPreferences d;
    private ScrollView e;
    private HorizontalFlowLayout f;
    private CursorEditText g;
    private List<String> h;
    private LinearLayout i;
    private com.sankuai.waimai.bussiness.order.comment.utils.a j;
    private ViewGroup k;
    private boolean l;
    private int m;
    private a n;
    private ArrayList o;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public static /* synthetic */ void a(InputBoardBlock inputBoardBlock, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, inputBoardBlock, changeQuickRedirect, false, "8639256314a8d16bf1e54c5992e53b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, inputBoardBlock, changeQuickRedirect, false, "8639256314a8d16bf1e54c5992e53b71");
        } else {
            JudasManualManager.a("b_zsj3jcfj").a("c_0f6oqhc").a("tag_number", i + 1).a(inputBoardBlock.b).a();
        }
    }

    public static /* synthetic */ void b(InputBoardBlock inputBoardBlock, boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, inputBoardBlock, changeQuickRedirect, false, "c7f6a95f21d4d252dfc7345a14fc66ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, inputBoardBlock, changeQuickRedirect, false, "c7f6a95f21d4d252dfc7345a14fc66ce");
        } else if (inputBoardBlock.e == null || !inputBoardBlock.e.isShown()) {
        } else {
            inputBoardBlock.e.setVisibility(8);
            inputBoardBlock.e.fullScroll(33);
            View childAt = inputBoardBlock.k.getChildAt(0);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = -1;
            childAt.setLayoutParams(layoutParams);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, inputBoardBlock, changeQuickRedirect2, false, "93933b69dd4478d2cf861d6df1fd7eba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, inputBoardBlock, changeQuickRedirect2, false, "93933b69dd4478d2cf861d6df1fd7eba");
            } else if (inputBoardBlock.g != null) {
                inputBoardBlock.g.requestFocus();
                inputBoardBlock.g.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.InputBoardBlock.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2cd76e92a2470d9dfc8dce4cdda5c7ff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2cd76e92a2470d9dfc8dce4cdda5c7ff");
                        } else {
                            InputBoardBlock.this.c.showSoftInput(InputBoardBlock.this.g, 0);
                        }
                    }
                });
            }
        }
    }

    public static /* synthetic */ void e(InputBoardBlock inputBoardBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, inputBoardBlock, changeQuickRedirect, false, "f0070a7c64870e3965b8aa6588ee66cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, inputBoardBlock, changeQuickRedirect, false, "f0070a7c64870e3965b8aa6588ee66cc");
        } else if (inputBoardBlock.e != null) {
            if (inputBoardBlock.m == 0) {
                inputBoardBlock.m = inputBoardBlock.getSupportSoftInputHeight();
            }
            if (inputBoardBlock.m == 0) {
                inputBoardBlock.m = inputBoardBlock.getKeyBoardHeight();
            }
            inputBoardBlock.e.getLayoutParams().height = inputBoardBlock.m;
            View childAt = inputBoardBlock.k.getChildAt(0);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = childAt.getHeight();
            childAt.setLayoutParams(layoutParams);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, inputBoardBlock, changeQuickRedirect2, false, "5108580828f4e12f17e6092298a7689e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, inputBoardBlock, changeQuickRedirect2, false, "5108580828f4e12f17e6092298a7689e");
            } else if (inputBoardBlock.g != null) {
                inputBoardBlock.c.hideSoftInputFromWindow(inputBoardBlock.g.getWindowToken(), 0);
            }
        }
    }

    public InputBoardBlock(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2915fcb0a0285cfb13f9d424b2daa3ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2915fcb0a0285cfb13f9d424b2daa3ce");
            return;
        }
        this.l = false;
        this.n = new a() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.InputBoardBlock.5
        };
        this.o = new ArrayList();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "831f427576689b4278cab13fa215f53a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "831f427576689b4278cab13fa215f53a");
        } else if (this.i != null && this.f != null && this.h != null) {
            this.i.removeAllViews();
            LayoutInflater from = LayoutInflater.from(this.b);
            for (final int i = 0; i < this.h.size(); i++) {
                final TextView a2 = a(from, this.i);
                a2.setText(this.h.get(i));
                a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.InputBoardBlock.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc2393b8b15e199b5372dd822650a938", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc2393b8b15e199b5372dd822650a938");
                            return;
                        }
                        InputBoardBlock.this.j.a(a2.getText().toString());
                        InputBoardBlock.a(InputBoardBlock.this, i);
                    }
                });
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d450fa3d423da45c1be5029feb7841e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d450fa3d423da45c1be5029feb7841e9");
                } else {
                    JudasManualManager.b("b_usmet7yy").a("c_0f6oqhc").a("tag_number", i + 1).a(this.b).a();
                }
                this.i.addView(a2);
            }
            this.f.removeAllViews();
            for (final int i2 = 0; i2 < this.h.size(); i2++) {
                final TextView a3 = a(from, this.f);
                a3.setText(this.h.get(i2));
                a3.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.InputBoardBlock.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "99a87a8644d55c7ed077e5e1f89c1acc", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "99a87a8644d55c7ed077e5e1f89c1acc");
                            return;
                        }
                        InputBoardBlock.this.j.a(a3.getText().toString());
                        InputBoardBlock.a(InputBoardBlock.this, i2);
                    }
                });
                this.f.addView(a3);
            }
        }
    }

    private TextView a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37e3e3da762bf079d7fc69d10a8297a", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37e3e3da762bf079d7fc69d10a8297a") : (TextView) layoutInflater.inflate(R.layout.wm_order_comment_inputboard_good, viewGroup, false);
    }

    private void setEditText(CursorEditText cursorEditText) {
        Object[] objArr = {cursorEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff050ef8b32866a2e494934efe48134a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff050ef8b32866a2e494934efe48134a");
            return;
        }
        this.g = cursorEditText;
        if (this.g == null) {
            return;
        }
        this.j.a(this.g);
    }

    private void setOpenBoardButton(final ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eacd0dff68d07533ba6077ce645f9e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eacd0dff68d07533ba6077ce645f9e05");
        } else {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.comment.rn.InputBoardBlock.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cefa86853928ff048e04c390df4f30c8", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cefa86853928ff048e04c390df4f30c8");
                    } else if (InputBoardBlock.this.e != null && InputBoardBlock.this.e.isShown()) {
                        InputBoardBlock.b(InputBoardBlock.this, true);
                        imageView.setImageResource(R.drawable.wm_order_comment_input_board_open);
                        InputBoardBlock.this.i.setVisibility(0);
                        InputBoardBlock.this.l = false;
                    } else {
                        InputBoardBlock.e(InputBoardBlock.this);
                        InputBoardBlock.this.l = true;
                        imageView.setImageResource(R.drawable.wm_order_comment_input_board_close);
                        InputBoardBlock.this.i.setVisibility(8);
                    }
                }
            });
        }
    }

    private int getSupportSoftInputHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa149cfa782ba3a85c3089ec65504c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa149cfa782ba3a85c3089ec65504c1")).intValue();
        }
        Rect rect = new Rect();
        this.b.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = this.b.getWindow().getDecorView().getRootView().getHeight() - rect.bottom;
        if (Build.VERSION.SDK_INT >= 20) {
            height -= getSoftButtonsBarHeight();
        }
        if (height < 0) {
            com.sankuai.waimai.foundation.utils.log.a.d("Input", "EmotionKeyboard--Warning: value of softInputHeight is below zero!", new Object[0]);
        }
        if (height > 0) {
            this.d.edit().putInt("soft_input_height", height).apply();
        }
        return height;
    }

    @TargetApi(17)
    private int getSoftButtonsBarHeight() {
        Resources resources;
        int identifier;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01026880b8468752ec693f3b64c85ea5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01026880b8468752ec693f3b64c85ea5")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            View findViewById = this.k.getRootView().findViewById(16908336);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return findViewById.getHeight();
            }
        } else if (!ViewConfiguration.get(this.b).hasPermanentMenuKey() && (identifier = (resources = this.b.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private int getKeyBoardHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f64b5484edc541b136ebcd95c1d2874d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f64b5484edc541b136ebcd95c1d2874d")).intValue() : this.d.getInt("soft_input_height", 787);
    }

    public a getOnEditTextListener() {
        return this.n;
    }

    public void setFoodList(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3845f4d592c1c10c2590d5b075b6710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3845f4d592c1c10c2590d5b075b6710");
            return;
        }
        this.h = list;
        if (list == null || list.isEmpty()) {
            this.h = new ArrayList();
        }
        this.j.a(list);
        this.j.a(this.g);
        a();
    }
}
