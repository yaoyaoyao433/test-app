package com.meituan.mmp.lib.widget;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DocumentPreviewActivity extends Activity {
    public static ChangeQuickRedirect a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String path;
        String str;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93da388eea013adde0ffe653e0d721cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93da388eea013adde0ffe653e0d721cf");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_document_preview);
        String a2 = com.sankuai.waimai.platform.utils.f.a(getIntent(), TbsReaderView.KEY_FILE_PATH);
        String a3 = com.sankuai.waimai.platform.utils.f.a(getIntent(), "fileType");
        if (a2 == null) {
            finish();
            return;
        }
        File file = new File(a2);
        if (!file.exists()) {
            finish();
            return;
        }
        String a4 = ai.a(file.getAbsolutePath());
        if (TextUtils.isEmpty(a3)) {
            a3 = ai.b(a4);
        }
        String str2 = a3;
        Object[] objArr2 = {file};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "792af39edd651504847f19c4c77a4bcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "792af39edd651504847f19c4c77a4bcc");
        } else {
            findViewById(R.id.img_back).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.widget.DocumentPreviewActivity.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "194794d980f1c1246016e658c6fbfe11", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "194794d980f1c1246016e658c6fbfe11");
                    } else {
                        DocumentPreviewActivity.this.finish();
                    }
                }
            });
            ((TextView) findViewById(R.id.tv_title)).setText(file.getName());
        }
        if (!com.meituan.mmp.lib.config.f.c) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c79c202d363270d904de1e4a982e3e8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c79c202d363270d904de1e4a982e3e8a");
            } else {
                ((FrameLayout) findViewById(R.id.mmp_reader_view)).addView(new TbsReaderView(this, new TbsReaderView.ReaderCallback() { // from class: com.meituan.mmp.lib.widget.DocumentPreviewActivity.2
                    @Override // com.tencent.smtt.sdk.TbsReaderView.ReaderCallback
                    public final void onCallBackAction(Integer num, Object obj, Object obj2) {
                    }
                }), new RelativeLayout.LayoutParams(-1, -1));
            }
        }
        Object[] objArr4 = {file, str2, a4};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b14853abf1b53bbaefb98590da9c58fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b14853abf1b53bbaefb98590da9c58fb");
            return;
        }
        if (!com.meituan.mmp.lib.config.f.c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(TbsReaderView.KEY_FILE_PATH, file.getAbsolutePath());
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7fba4c885bc7e208ab729a9c3c1910be", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7fba4c885bc7e208ab729a9c3c1910be");
            } else {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "0fe310c74703c2ad2a2c9658703ca3e4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "0fe310c74703c2ad2a2c9658703ca3e4")).booleanValue() : "mounted".equals(Environment.getExternalStorageState())) {
                    path = com.meituan.mmp.lib.utils.f.d(this, "").getPath();
                } else {
                    path = com.meituan.mmp.lib.utils.f.b(this, "").getPath();
                }
                str = path;
                File file2 = new File(str);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
            }
            bundle2.putString(TbsReaderView.KEY_TEMP_PATH, str);
            TbsReaderView a5 = a();
            if (a5 == null) {
                return;
            }
            if (a5.preOpen(str2, false)) {
                a5.openFile(bundle2);
                return;
            }
        }
        finish();
        a(file, a4);
    }

    @Nullable
    private TbsReaderView a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf2579905890da0c325f616944e7f06", RobustBitConfig.DEFAULT_VALUE)) {
            return (TbsReaderView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf2579905890da0c325f616944e7f06");
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mmp_reader_view);
        for (int i = 0; i < frameLayout.getChildCount(); i++) {
            View childAt = frameLayout.getChildAt(i);
            if (childAt instanceof TbsReaderView) {
                return (TbsReaderView) childAt;
            }
        }
        return null;
    }

    private void a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eff4c00810c4918c9d964cd0ba4a2cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eff4c00810c4918c9d964cd0ba4a2cd");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri fromFile = Uri.fromFile(file);
        if (Build.VERSION.SDK_INT > 23 || b()) {
            fromFile = FileProvider.getUriForFile(this, getPackageName() + ".mmp.file.provider", file);
            intent.addFlags(1);
        }
        intent.addFlags(y.a);
        intent.setDataAndType(fromFile, str);
        startActivity(intent);
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b82aad92dfb9f3d68f5e33880afbad9b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b82aad92dfb9f3d68f5e33880afbad9b")).booleanValue();
        }
        if ("HUAWEI".equals(Build.BRAND) && "MLA-AL10".equals(Build.BOARD) && "6.0".equals(Build.VERSION.RELEASE)) {
            return true;
        }
        return "Meizu".equals(Build.BRAND) && "m3note".equals(Build.BOARD) && "5.1".equals(Build.VERSION.RELEASE);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        TbsReaderView a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edfb72ed264928f8b0235f01152c22c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edfb72ed264928f8b0235f01152c22c");
            return;
        }
        if (!com.meituan.mmp.lib.config.f.c && (a2 = a()) != null) {
            a2.onStop();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc08fedb182ba25d8ab9c7339538bbb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc08fedb182ba25d8ab9c7339538bbb")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
