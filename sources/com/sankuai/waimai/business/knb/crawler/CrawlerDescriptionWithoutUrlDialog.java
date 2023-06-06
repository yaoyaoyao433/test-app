package com.sankuai.waimai.business.knb.crawler;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CrawlerDescriptionWithoutUrlDialog extends Dialog {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private Context e;

    public CrawlerDescriptionWithoutUrlDialog(@NonNull Context context) {
        this(context, R.style.WmCrawlerDialogTheme);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2b59a1f4f3b0a9222739ed226059bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2b59a1f4f3b0a9222739ed226059bb");
        }
    }

    private CrawlerDescriptionWithoutUrlDialog(@NonNull Context context, int i) {
        super(context, R.style.WmCrawlerDialogTheme);
        WindowManager.LayoutParams attributes;
        Object[] objArr = {context, Integer.valueOf((int) R.style.WmCrawlerDialogTheme)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b86608b391717f609ad616183eb66fe9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b86608b391717f609ad616183eb66fe9");
            return;
        }
        this.e = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7216cc67b946dc2920324aba73181583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7216cc67b946dc2920324aba73181583");
            return;
        }
        setContentView((ViewGroup) LayoutInflater.from(this.e).inflate(R.layout.wm_knb_crawler_layout_crawler_description_without_url, (ViewGroup) null, false));
        this.b = (TextView) findViewById(R.id.text_description);
        this.c = (TextView) findViewById(R.id.text_custom_ip);
        this.d = (ImageView) findViewById(R.id.image_close);
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.gravity = 17;
            attributes.height = -1;
            attributes.width = -1;
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setAttributes(attributes);
        }
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.knb.crawler.CrawlerDescriptionWithoutUrlDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "acdb69e1b7260a303317950031e0b717", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "acdb69e1b7260a303317950031e0b717");
                } else {
                    CrawlerDescriptionWithoutUrlDialog.this.dismiss();
                }
            }
        });
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6ce8e5080175ad5e7f7308bb44c5a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6ce8e5080175ad5e7f7308bb44c5a7");
        } else if (this.b != null) {
            this.b.setText(str);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1146cc4346559cf05f908a93d09e2cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1146cc4346559cf05f908a93d09e2cc");
        } else if (this.c != null) {
            this.c.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6621be223396dd4893a1b9bbcb22ea5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6621be223396dd4893a1b9bbcb22ea5b");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8102e58df922ac915ee70c8f9272ce5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8102e58df922ac915ee70c8f9272ce5");
        } else if (getOwnerActivity() == null || getOwnerActivity().isFinishing()) {
        } else {
            super.show();
        }
    }
}
