package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.utils.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WXMusicObject implements WXMediaMessage.IMediaObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final int LYRIC_LENGTH_LIMIT = 32768;
    private static final String TAG = "MicroMsg.SDK.WXMusicObject";
    public String musicDataUrl;
    public String musicLowBandDataUrl;
    public String musicLowBandUrl;
    public String musicUrl;
    public String songAlbumUrl;
    public String songLyric;

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        String str;
        String str2;
        String str3;
        String str4 = this.musicUrl;
        if ((str4 == null || str4.length() == 0) && ((str = this.musicLowBandUrl) == null || str.length() == 0)) {
            str2 = TAG;
            str3 = "both arguments are null";
        } else {
            String str5 = this.musicUrl;
            if (str5 == null || str5.length() <= 10240) {
                String str6 = this.musicLowBandUrl;
                if (str6 == null || str6.length() <= 10240) {
                    String str7 = this.songAlbumUrl;
                    if (str7 == null || str7.length() <= 10240) {
                        String str8 = this.songLyric;
                        if (str8 == null || str8.length() <= 32768) {
                            return true;
                        }
                        str2 = TAG;
                        str3 = "checkArgs fail, songLyric is too long";
                    } else {
                        str2 = TAG;
                        str3 = "checkArgs fail, songAlbumUrl is too long";
                    }
                } else {
                    str2 = TAG;
                    str3 = "checkArgs fail, musicLowBandUrl is too long";
                }
            } else {
                str2 = TAG;
                str3 = "checkArgs fail, musicUrl is too long";
            }
        }
        Log.e(str2, str3);
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxmusicobject_musicUrl", this.musicUrl);
        bundle.putString("_wxmusicobject_musicLowBandUrl", this.musicLowBandUrl);
        bundle.putString("_wxmusicobject_musicDataUrl", this.musicDataUrl);
        bundle.putString("_wxmusicobject_musicLowBandDataUrl", this.musicLowBandDataUrl);
        bundle.putString("_wxmusicobject_musicAlbumUrl", this.songAlbumUrl);
        bundle.putString("_wxmusicobject_musicLyric", this.songLyric);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 3;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.musicUrl = bundle.getString("_wxmusicobject_musicUrl");
        this.musicLowBandUrl = bundle.getString("_wxmusicobject_musicLowBandUrl");
        this.musicDataUrl = bundle.getString("_wxmusicobject_musicDataUrl");
        this.musicLowBandDataUrl = bundle.getString("_wxmusicobject_musicLowBandDataUrl");
        this.songAlbumUrl = bundle.getString("_wxmusicobject_musicAlbumUrl");
        this.songLyric = bundle.getString("_wxmusicobject_musicLyric");
    }
}
