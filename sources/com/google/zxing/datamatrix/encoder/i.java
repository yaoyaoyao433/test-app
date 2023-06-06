package com.google.zxing.datamatrix.encoder;

import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.sankuai.meituan.model.datarequest.topic.Topic;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.smtt.sdk.TbsListener;
import io.agora.rtc.Constants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    private static final int[] a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] b = {new int[]{TbsListener.ErrorCode.INCR_ERROR_DETAIL, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, TbsListener.ErrorCode.STARTDOWNLOAD_7, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 248, 116, 255, 110, 61}, new int[]{TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5, 138, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 12, 194, TbsListener.ErrorCode.STARTDOWNLOAD_9, 39, 245, 60, 97, 120}, new int[]{41, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, 158, 91, 61, 42, 142, 213, 97, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, 100, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION}, new int[]{Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, Topic.BUSSINESS_CAT_AROUND_TRAVEL, 100, 39, 188, 75, 66, 61, TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 213, 109, 129, 94, 254, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 48, 90, 188}, new int[]{15, Topic.BUSSINESS_CAT_AROUND_TRAVEL, 244, 9, TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS, 71, TbsListener.ErrorCode.STARTDOWNLOAD_9, 2, 188, 160, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, 145, 253, 79, 108, 82, 27, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_4, 186, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_2}, new int[]{52, 190, 88, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 109, 39, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_6, 21, Constants.ERR_PUBLISH_STREAM_NOT_FOUND, 197, 251, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, Constants.ERR_PUBLISH_STREAM_NOT_FOUND, 21, 5, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_2, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, TbsListener.ErrorCode.RENAME_FAIL, 43, 97, 71, 96, 103, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_4, 37, Constants.ERR_PUBLISH_STREAM_CDN_ERROR, TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, Constants.ERR_PUBLISH_STREAM_CDN_ERROR, TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS, TbsListener.ErrorCode.STARTDOWNLOAD_9, 93, 255}, new int[]{245, 127, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 130, CustomizedScrollView.ANIMATED_SCROLL_GAP, TbsListener.ErrorCode.STARTDOWNLOAD_3, 181, 102, 120, 84, 179, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, 251, 80, 182, TbsListener.ErrorCode.INSTALL_FROM_UNZIP, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5, 184, 59, 25, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, 247, 105, 122, 2, 245, 133, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 8, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5, 95, 100, 9, TbsListener.ErrorCode.STARTDOWNLOAD_8, 105, TbsListener.ErrorCode.COPY_TMPDIR_ERROR, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, MapConstant.ANIMATION_DURATION_SHORT, TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING, TbsListener.ErrorCode.DEXOAT_EXCEPTION, 5, 9, 5}, new int[]{245, 132, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_2, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 96, 32, 117, 22, TbsListener.ErrorCode.TPATCH_FAIL, 133, TbsListener.ErrorCode.TPATCH_FAIL, TbsListener.ErrorCode.RENAME_FAIL, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 188, TbsListener.ErrorCode.DECOUPLE_TPATCH_INSTALL_SUCCESS, 87, 191, 106, 16, 147, 118, 23, 37, 90, TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, TbsListener.ErrorCode.UNZIP_DIR_ERROR, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_6, 87, 187, 147, 160, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5, 69, 213, 92, 253, TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, 19}, new int[]{TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5, 9, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.TPATCH_FAIL, 12, 17, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, 100, 29, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5, TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, TbsListener.ErrorCode.RENAME_SUCCESS, 192, TbsListener.ErrorCode.COPY_EXCEPTION, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_FAIL, MapConstant.ANIMATION_DURATION_SHORT, 159, 36, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 38, 200, 132, 54, TbsListener.ErrorCode.INCR_ERROR_DETAIL, 146, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, 117, TbsListener.ErrorCode.APK_VERSION_ERROR, 29, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, 144, TbsListener.ErrorCode.TPATCH_FAIL, 22, MapConstant.ANIMATION_DURATION_SHORT, TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, 117, 62, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, TbsListener.ErrorCode.STARTDOWNLOAD_5, 13, 137, 245, 127, 67, 247, 28, Constants.ERR_PUBLISH_STREAM_NOT_FOUND, 43, TbsListener.ErrorCode.APK_VERSION_ERROR, 107, TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS, 53, 143, 46}, new int[]{TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 93, TbsListener.ErrorCode.STARTDOWNLOAD_10, 50, 144, TbsListener.ErrorCode.ROM_NOT_ENOUGH, 39, 118, 202, 188, TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM, 189, 143, 108, 196, 37, 185, 112, 134, TbsListener.ErrorCode.RENAME_SUCCESS, 245, 63, 197, 190, CustomizedScrollView.ANIMATED_SCROLL_GAP, 106, 185, TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5, 64, 114, 71, TbsListener.ErrorCode.STARTDOWNLOAD_2, 44, 147, 6, 27, TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION, 51, 63, 87, 10, 40, 130, 188, 17, TbsListener.ErrorCode.STARTDOWNLOAD_4, 31, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_6, TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, 4, 107, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, 7, 94, TbsListener.ErrorCode.STARTDOWNLOAD_7, TbsListener.ErrorCode.EXCEED_INCR_UPDATE, 124, 86, 47, 11, TbsListener.ErrorCode.APK_INVALID}, new int[]{TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, TbsListener.ErrorCode.INCR_ERROR_DETAIL, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_3, 89, 251, TbsListener.ErrorCode.NEEDDOWNLOAD_10, 159, 56, 89, 33, 147, 244, Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR, 36, 73, 127, 213, 136, 248, TXLiveConstants.RENDER_ROTATION_180, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, 197, 158, TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING, 68, 122, 93, 213, 15, 160, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS, 66, 139, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, 185, 202, TbsListener.ErrorCode.STARTDOWNLOAD_8, 179, 25, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, 96, TbsListener.ErrorCode.ROM_NOT_ENOUGH, TbsListener.ErrorCode.RENAME_FAIL, 136, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 181, TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 59, 52, TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_2, 25, 49, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, 189, 64, 54, 108, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, 132, 63, 96, 103, 82, 186}};
    private static final int[] c = new int[256];
    private static final int[] d = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            d[i2] = i;
            c[i] = i2;
            i *= 2;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    public static String a(String str, k kVar) {
        if (str.length() != kVar.b) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(kVar.b + kVar.c);
        sb.append(str);
        int a2 = kVar.a();
        if (a2 == 1) {
            sb.append(a(str, kVar.c));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[a2];
            int[] iArr2 = new int[a2];
            int[] iArr3 = new int[a2];
            int i = 0;
            while (i < a2) {
                int i2 = i + 1;
                iArr[i] = kVar.a(i2);
                iArr2[i] = kVar.f;
                iArr3[i] = 0;
                if (i > 0) {
                    iArr3[i] = iArr3[i - 1] + iArr[i];
                }
                i = i2;
            }
            for (int i3 = 0; i3 < a2; i3++) {
                StringBuilder sb2 = new StringBuilder(iArr[i3]);
                for (int i4 = i3; i4 < kVar.b; i4 += a2) {
                    sb2.append(str.charAt(i4));
                }
                String a3 = a(sb2.toString(), iArr2[i3]);
                int i5 = i3;
                int i6 = 0;
                while (i5 < iArr2[i3] * a2) {
                    sb.setCharAt(kVar.b + i5, a3.charAt(i6));
                    i5 += a2;
                    i6++;
                }
            }
        }
        return sb.toString();
    }

    private static String a(CharSequence charSequence, int i) {
        return a(charSequence, 0, charSequence.length(), i);
    }

    private static String a(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        while (true) {
            if (i4 >= a.length) {
                i4 = -1;
                break;
            } else if (a[i4] == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: " + i3);
        }
        int[] iArr = b[i4];
        char[] cArr = new char[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            cArr[i5] = 0;
        }
        for (int i6 = 0; i6 < i2 + 0; i6++) {
            int i7 = i3 - 1;
            int charAt = cArr[i7] ^ charSequence.charAt(i6);
            while (i7 > 0) {
                if (charAt != 0 && iArr[i7] != 0) {
                    cArr[i7] = (char) (cArr[i7 - 1] ^ d[(c[charAt] + c[iArr[i7]]) % 255]);
                } else {
                    cArr[i7] = cArr[i7 - 1];
                }
                i7--;
            }
            if (charAt != 0 && iArr[0] != 0) {
                cArr[0] = (char) d[(c[charAt] + c[iArr[0]]) % 255];
            } else {
                cArr[0] = 0;
            }
        }
        char[] cArr2 = new char[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            cArr2[i8] = cArr[(i3 - i8) - 1];
        }
        return String.valueOf(cArr2);
    }
}
