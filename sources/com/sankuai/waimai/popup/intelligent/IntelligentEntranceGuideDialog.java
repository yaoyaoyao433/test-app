package com.sankuai.waimai.popup.intelligent;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.widget.HollowView;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class IntelligentEntranceGuideDialog extends Dialog {
    public static ChangeQuickRedirect a;
    float b;
    float c;
    a d;
    HollowView e;
    View f;
    TextView g;
    TextView h;
    ImageView i;
    private Context j;
    private View k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    public static /* synthetic */ void a(IntelligentEntranceGuideDialog intelligentEntranceGuideDialog) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, intelligentEntranceGuideDialog, changeQuickRedirect, false, "e27ad257c34c988e9ff2209a128774af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, intelligentEntranceGuideDialog, changeQuickRedirect, false, "e27ad257c34c988e9ff2209a128774af");
            return;
        }
        int a2 = g.a(intelligentEntranceGuideDialog.j, 206.0f);
        int height = intelligentEntranceGuideDialog.f.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) intelligentEntranceGuideDialog.f.getLayoutParams();
        layoutParams.leftMargin = (int) (((intelligentEntranceGuideDialog.b - g.a(intelligentEntranceGuideDialog.j, 27.0f)) - g.a(intelligentEntranceGuideDialog.j, 30.0f)) - a2);
        layoutParams.topMargin = (int) (intelligentEntranceGuideDialog.c - ((height - g.a(intelligentEntranceGuideDialog.j, 8.0f)) - g.a(intelligentEntranceGuideDialog.j, 135.0f)));
        intelligentEntranceGuideDialog.f.setLayoutParams(layoutParams);
        intelligentEntranceGuideDialog.f.setVisibility(0);
    }

    public IntelligentEntranceGuideDialog(@NonNull Context context) {
        super(context, R.style.UGCFeedGuideDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a21b013b0dd1ec5847c9734ffcca09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a21b013b0dd1ec5847c9734ffcca09");
            return;
        }
        this.j = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5449179d0c4354bd63ba3da2b2223df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5449179d0c4354bd63ba3da2b2223df");
        } else if (getWindow() != null) {
            getWindow().addFlags(512);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 0;
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            setCancelable(false);
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "be2d7050654e3e05d2deb69bdab22e27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "be2d7050654e3e05d2deb69bdab22e27");
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = new HollowView(context);
        this.e.setBackgroundColor(-1308622848);
        this.e.setClickThroughPoiCircle(true);
        frameLayout.addView(this.e, -1, -1);
        this.f = LayoutInflater.from(context).inflate(R.layout.wm_page_home_intelligent_entrance_guide, (ViewGroup) frameLayout, false);
        this.k = this.f.findViewById(R.id.intelligent_guide_content);
        this.g = (TextView) this.f.findViewById(R.id.intelligent_guide_title);
        this.h = (TextView) this.f.findViewById(R.id.intelligent_guide_sub_title);
        this.i = (ImageView) this.f.findViewById(R.id.intelligent_guide_pic);
        frameLayout.addView(this.f);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.popup.intelligent.IntelligentEntranceGuideDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3c80c40f4a54b6705358c1153f4cf9ac", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3c80c40f4a54b6705358c1153f4cf9ac");
                } else {
                    IntelligentEntranceGuideDialog.this.dismiss();
                }
            }
        });
        setContentView(frameLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f9b90c8c728d35f5249e6c0a13444f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f9b90c8c728d35f5249e6c0a13444f3")).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        Object[] objArr2 = {Float.valueOf(x), Float.valueOf(y)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a32828b1daddd0b886bfd73255444090", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a32828b1daddd0b886bfd73255444090")).booleanValue() : this.e.getHollowRegion().contains(x, y)) {
            if (action == 1) {
                a(true);
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cedef2aea9afd67197f12ab8c64c872c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cedef2aea9afd67197f12ab8c64c872c");
        } else {
            super.show();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b734f36dd23ab209322d96b7e69f42b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b734f36dd23ab209322d96b7e69f42b9");
        } else {
            super.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab802288143da55d47f1bcf34cbadb71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab802288143da55d47f1bcf34cbadb71");
            return;
        }
        dismiss();
        if (this.d != null) {
            this.d.a(z);
        }
    }
}
