package com.hhmedic.android.sdk.module.video.widget.chat;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.config.HHConfig;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CertificateWindow extends PopupWindow {
    private ImageView mCertificateImage;
    private final Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CertificateWindow(Context context) {
        super(context);
        this.mContext = context;
        initView(context);
    }

    private void initView(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.hh_certificate_layout, (ViewGroup) null);
        parserView(inflate);
        setContentView(inflate);
        setWidth(-1);
        setHeight(-1);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setClippingEnabled(false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.CertificateWindow.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CertificateWindow.this.close();
            }
        });
    }

    private void parserView(View view) {
        this.mCertificateImage = (ImageView) view.findViewById(R.id.hh_doctor_certificate);
        ImageView imageView = (ImageView) view.findViewById(R.id.hh_certificate_close);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.hhmedic.android.sdk.module.video.widget.chat.CertificateWindow.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                CertificateWindow.this.close();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bind(String str) {
        if (TextUtils.isEmpty(str) || this.mCertificateImage == null || HHConfig.getImageLoader() == null) {
            return;
        }
        HHConfig.getImageLoader().loadImage(this.mContext, R.drawable.hp_call_default_loading, str, this.mCertificateImage);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showCertificate(View view) {
        try {
            p.a(this, view, 0, 0, 0);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void close() {
        try {
            p.b(this);
        } catch (Exception e) {
            Logger.e(e.getMessage());
        }
    }
}
