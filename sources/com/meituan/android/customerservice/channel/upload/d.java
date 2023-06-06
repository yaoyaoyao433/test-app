package com.meituan.android.customerservice.channel.upload;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dianping.imagemanager.DPImageView;
import com.meituan.android.customerservice.channel.upload.bean.UploadFileInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    int b;
    ArrayList<UploadFileInfo> c;
    c d;
    InterfaceC0242d e;
    int f;
    private int g;
    private int h;
    private Activity i;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        void a(int i);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.channel.upload.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0242d {
        void a(int i);
    }

    public d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aab6cd753ff282f45d74660056cbf8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aab6cd753ff282f45d74660056cbf8f");
            return;
        }
        this.g = 3;
        this.b = 6;
        this.c = new ArrayList<>();
        this.i = activity;
        this.f = (com.meituan.android.customerservice.kit.utils.c.a(this.i) - com.meituan.android.customerservice.kit.utils.c.a(this.i, (float) (((this.g - 1) * 23.5d) + 88.0d))) / this.g;
        this.h = this.f + com.meituan.android.customerservice.kit.utils.c.a(this.i, 9.5f);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12115ea66424d9a6119808167e07e0b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12115ea66424d9a6119808167e07e0b5");
        }
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cs_view_add_upload_file_item, (ViewGroup) null, false);
            inflate.setLayoutParams(new ViewGroup.LayoutParams(this.f, this.h));
            return new a(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cs_view_show_upload_file_item, (ViewGroup) null, false);
        inflate2.setLayoutParams(new ViewGroup.LayoutParams(this.f, -2));
        return new b(inflate2);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.s sVar, final int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013ebf6118bf8b3b1cf6cb64d1e5e225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013ebf6118bf8b3b1cf6cb64d1e5e225");
        } else if (sVar instanceof b) {
            b bVar = (b) sVar;
            Object[] objArr2 = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea668690692b5d76e288deab61b9d350", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea668690692b5d76e288deab61b9d350");
                return;
            }
            UploadFileInfo uploadFileInfo = this.c.get(i);
            if (uploadFileInfo != null) {
                bVar.b.setVisibility(0);
                bVar.b.setTag("delete");
                bVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.customerservice.channel.upload.d.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb3eb12e9fe3bd04e829fde16849ce12", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb3eb12e9fe3bd04e829fde16849ce12");
                            return;
                        }
                        d dVar = d.this;
                        int i2 = i;
                        Object[] objArr4 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "e7ade68c27e01836bb780be841b4f73f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "e7ade68c27e01836bb780be841b4f73f");
                        } else if (i2 < 0 || i2 >= dVar.c.size()) {
                        } else {
                            dVar.c.remove(i2);
                            dVar.notifyDataSetChanged();
                            if (dVar.e != null) {
                                dVar.e.a(dVar.c.size());
                            }
                        }
                    }
                });
                bVar.c.setImageSize(this.f, this.h);
                bVar.c.setToken(uploadFileInfo.getToken());
                switch (uploadFileInfo.getFileType()) {
                    case 0:
                        if (!TextUtils.isEmpty(uploadFileInfo.getLocalPath())) {
                            bVar.c.setImage(uploadFileInfo.getLocalPath());
                            break;
                        } else {
                            bVar.c.setImageResource(R.drawable.cs_upload_img_placeholder_error);
                            break;
                        }
                    case 1:
                        if (uploadFileInfo.getVideoData() != null && uploadFileInfo.getVideoData().thumbUrl != null) {
                            bVar.c.setImageBitmap(uploadFileInfo.getVideoData().thumbUrl);
                            break;
                        } else {
                            bVar.c.setImageResource(R.drawable.cs_upload_img_placeholder_error);
                            break;
                        }
                        break;
                }
                a(uploadFileInfo.getFileName(), bVar.d);
                bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.customerservice.channel.upload.d.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6c3738a8a997cf77354269553c5e1c4", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6c3738a8a997cf77354269553c5e1c4");
                        } else if (d.this.d != null) {
                            d.this.d.a(2);
                        }
                    }
                });
            }
        } else {
            a aVar = (a) sVar;
            Object[] objArr3 = {aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "669fe0406626b70561273c18af8760bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "669fe0406626b70561273c18af8760bc");
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (!this.c.isEmpty()) {
                layoutParams.topMargin = com.meituan.android.customerservice.kit.utils.c.a(this.i, -3.0f);
            } else {
                layoutParams.topMargin = 0;
            }
            aVar.b.setLayoutParams(layoutParams);
            aVar.b.setImageDrawable(ContextCompat.getDrawable(this.i, R.drawable.cs_voip_ic_add));
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.customerservice.channel.upload.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b7957571b6d9fbfa6c0bea83370e62e2", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b7957571b6d9fbfa6c0bea83370e62e2");
                    } else if (d.this.d != null) {
                        d.this.d.a(1);
                    }
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "235c6300413e4843a5cd46da31175505", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "235c6300413e4843a5cd46da31175505")).intValue();
        }
        if (this.c == null) {
            return 1;
        }
        if (this.c.size() >= this.b) {
            return this.b;
        }
        return this.c.size() + 1;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2630a5e01bcfd283744821f0b353e9a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2630a5e01bcfd283744821f0b353e9a")).intValue() : (this.c.size() < this.b && i == this.c.size()) ? 1 : 2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        DPImageView c;
        TextView d;

        public b(View view) {
            super(view);
            Object[] objArr = {d.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d21227de4682bebeea322af850ba5f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d21227de4682bebeea322af850ba5f");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.iv_delete);
            this.c = (DPImageView) view.findViewById(R.id.iv_file_upload);
            this.d = (TextView) view.findViewById(R.id.tv_file_name);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;

        public a(View view) {
            super(view);
            Object[] objArr = {d.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea914f592a7b378faf2a766161083505", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea914f592a7b378faf2a766161083505");
            } else {
                this.b = (ImageView) view.findViewById(R.id.iv_add_proofs);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79583e48a2d142622cc0866095ba2af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79583e48a2d142622cc0866095ba2af1");
        } else {
            this.c.clear();
        }
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2e7959f3f133521a9e81c709a026f0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2e7959f3f133521a9e81c709a026f0")).intValue() : this.c.size();
    }

    private void a(final String str, final TextView textView) {
        String substring;
        char[] charArray;
        int i;
        char c2 = 0;
        Object[] objArr = {str, textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee6882f450598325ecde0c09f553da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee6882f450598325ecde0c09f553da2");
        } else if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            final String[] strArr = {""};
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.channel.utils.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "17cbe36c03876b93c21a80c64d820259", RobustBitConfig.DEFAULT_VALUE)) {
                substring = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "17cbe36c03876b93c21a80c64d820259");
            } else if (TextUtils.isEmpty(str)) {
                substring = null;
            } else {
                substring = str.lastIndexOf(CommonConstant.Symbol.DOT) < 0 ? "" : str.substring(0, str.lastIndexOf(CommonConstant.Symbol.DOT));
            }
            if (!TextUtils.isEmpty(substring)) {
                String str2 = "";
                int i2 = 0;
                int i3 = 0;
                while (i2 < 4) {
                    String substring2 = substring.substring((substring.length() - i3) - 1, substring.length() - i3);
                    Object[] objArr3 = new Object[1];
                    objArr3[c2] = substring2;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b59cc8c52cea10020996cc3eec01e785", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b59cc8c52cea10020996cc3eec01e785")).intValue();
                    } else if (substring2 == null || substring2.length() <= 0) {
                        i = 0;
                    } else {
                        i = 0;
                        for (int i4 = 0; i4 < substring2.length(); i4++) {
                            i = Pattern.compile("[一-龥]").matcher(substring2).matches() ? i + 2 : i + 1;
                        }
                    }
                    i2 += i;
                    if (i2 > 4) {
                        break;
                    }
                    str2 = str2 + substring2;
                    i3++;
                    c2 = 0;
                }
                for (int length = str2.toCharArray().length - 1; length >= 0; length += -1) {
                    strArr[0] = strArr[0] + charArray[length];
                }
            }
            if (!TextUtils.isEmpty(com.meituan.android.customerservice.channel.utils.a.b(str))) {
                strArr[0] = strArr[0] + CommonConstant.Symbol.DOT + com.meituan.android.customerservice.channel.utils.a.b(str);
            }
            final int paddingLeft = textView.getPaddingLeft();
            final int paddingRight = textView.getPaddingRight();
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.customerservice.channel.upload.d.4
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    int i5;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e7efd5a8d5aacf62fb68e9b00914a29d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e7efd5a8d5aacf62fb68e9b00914a29d");
                        return;
                    }
                    textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    TextPaint paint = textView.getPaint();
                    float measureText = paint.measureText(StringUtil.SPACE);
                    String str3 = (String) TextUtils.ellipsize(str.substring(0, str.lastIndexOf(strArr[0])), paint, (((d.this.f - paddingLeft) - paddingRight) * 2) - (paint.measureText(strArr[0]) + measureText), TextUtils.TruncateAt.END);
                    if (paint.measureText(str) > d.this.f) {
                        int i6 = 0;
                        while (true) {
                            i5 = i6 + 1;
                            if (paint.measureText(str.substring(0, i5)) > d.this.f - measureText) {
                                break;
                            }
                            i6 = i5;
                        }
                        if (str3.length() > i6) {
                            str3 = str3.substring(0, i6) + StringUtil.SPACE + str3.substring(i5);
                        }
                    }
                    strArr[0] = str3 + strArr[0];
                    textView.setText(strArr[0]);
                }
            });
        }
    }
}
