package com.tencent.smtt.sdk;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.webkit.WebIconDatabase;
import com.tencent.smtt.export.external.interfaces.IconListener;
@Deprecated
/* loaded from: classes6.dex */
public class WebIconDatabase {
    private static WebIconDatabase a;

    @Deprecated
    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, Bitmap bitmap);
    }

    private WebIconDatabase() {
    }

    private static synchronized WebIconDatabase a() {
        WebIconDatabase webIconDatabase;
        synchronized (WebIconDatabase.class) {
            if (a == null) {
                a = new WebIconDatabase();
            }
            webIconDatabase = a;
        }
        return webIconDatabase;
    }

    public static WebIconDatabase getInstance() {
        return a();
    }

    public void bulkRequestIconForPageUrl(ContentResolver contentResolver, String str, a aVar) {
    }

    public void close() {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebIconDatabase.getInstance().close();
        } else {
            a2.c().m();
        }
    }

    public void open(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebIconDatabase.getInstance().open(str);
        } else {
            a2.c().b(str);
        }
    }

    public void releaseIconForPageUrl(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebIconDatabase.getInstance().releaseIconForPageUrl(str);
        } else {
            a2.c().d(str);
        }
    }

    public void removeAllIcons() {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebIconDatabase.getInstance().removeAllIcons();
        } else {
            a2.c().l();
        }
    }

    public void requestIconForPageUrl(String str, final a aVar) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebIconDatabase.getInstance().requestIconForPageUrl(str, new WebIconDatabase.IconListener() { // from class: com.tencent.smtt.sdk.WebIconDatabase.2
                @Override // android.webkit.WebIconDatabase.IconListener
                public void onReceivedIcon(String str2, Bitmap bitmap) {
                    aVar.a(str2, bitmap);
                }
            });
        } else {
            a2.c().a(str, new IconListener() { // from class: com.tencent.smtt.sdk.WebIconDatabase.1
                @Override // com.tencent.smtt.export.external.interfaces.IconListener
                public void onReceivedIcon(String str2, Bitmap bitmap) {
                    aVar.a(str2, bitmap);
                }
            });
        }
    }

    public void retainIconForPageUrl(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebIconDatabase.getInstance().retainIconForPageUrl(str);
        } else {
            a2.c().c(str);
        }
    }
}
