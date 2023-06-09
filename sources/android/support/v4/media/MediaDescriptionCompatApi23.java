package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import android.support.annotation.RequiresApi;
import android.support.v4.media.MediaDescriptionCompatApi21;
/* compiled from: ProGuard */
@RequiresApi(23)
/* loaded from: classes.dex */
public class MediaDescriptionCompatApi23 extends MediaDescriptionCompatApi21 {
    MediaDescriptionCompatApi23() {
    }

    public static Uri getMediaUri(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Builder extends MediaDescriptionCompatApi21.Builder {
        Builder() {
        }

        public static void setMediaUri(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }
}
