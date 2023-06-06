package com.meituan.android.mrn.config;

import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum q {
    ERROR_CREATE_INSTANCE(1),
    ERROR_CREATE_MRN_INSTANCE(1000),
    LOCAL_BASE_NOT_FOUND(1001),
    DIO_BASE_READ_ERROR(1002),
    LOAD_BASE_ERROR(1003),
    LOAD_BASE_TIMEOUT(1004),
    ERROR_SO_LOAD(2),
    LOAD_SO_FAILED(2000),
    LOAD_MAIN_BUNDLE_FAILED(2001),
    LOAD_SUB_BUNDLE_FAILED(2002),
    BUNDLE_INCOMPLETE(2003),
    ERROR_UNZIPFAIL(3),
    DOWNLOAD_OR_UNZIP_FAILED(3000),
    DD_HTTP_CODE_ERROR(3001),
    DD_HTTP_FAILED(3002),
    DD_NO_BUNDLE_INFO(3003),
    BUNDLE_DOWNLOAD_FAILED(3004),
    BUNDLE_MD5_VERIFY_FAILED(3005),
    BUNDLE_UNZIP_FAILED(3006),
    BUNDLE_FILE_READ_ERROR(3007),
    BUNDLE_SERVICE_ERROR_DOWNLOAD(3100),
    BUNDLE_SERVICE_ERROR_DOWNLOAD_FILE_LENGTH_ERROR(3101),
    BUNDLE_SERVICE_ERROR_READ_FILE(3102),
    BUNDLE_SERVICE_ERROR_VERIFY(3103),
    BUNDLE_SERVICE_ERROR_PACKAGE(3104),
    BUNDLE_SERVICE_ERROR_L9_UNZIP(3105),
    BUNDLE_SERVICE_ERROR_L0_UNZIP(3106),
    BUNDLE_SERVICE_ERROR_L0_NOT_FOUND(3107),
    BUNDLE_SERVICE_ERROR_PATCH(3108),
    BUNDLE_SERVICE_ERROR_DELETE(3109),
    BUNDLE_SERVICE_ERROR_SET_UP(3110),
    BUNDLE_SERVICE_ERROR_DOWNLOAD_SAVE(3111),
    BUNDLE_SERVICE_ERROR_INPUT(3112),
    BUNDLE_SERVICE_ERROR_DOWNLOAD_INPUT_STREAM_NULL(3113),
    BUNDLE_SERVICE_ERROR_UNZIP_L0_NOT_EXISTS(3114),
    BUNDLE_SERVICE_ERROR_SAVE_TARGET_PATH_OCCUPY(3115),
    BUNDLE_SERVICE_ERROR_SAVE_L0_NOT_FILE(3116),
    BUNDLE_SERVICE_ERROR_SAVE_MD5_NOT_EQUAL(3117),
    BUNDLE_SERVICE_ERROR_SAVE_WRITE_L9_EXCEPTION(3118),
    BUNDLE_SERVICE_ERROR_SAVE_L9_NOT_EXIST(3119),
    BUNDLE_SERVICE_ERROR_SAVE_NOT_UNZIP_RENAME(3120),
    ERROR_JS_BUSINESS(4),
    RUNTIME_JS_ERROR(4000),
    ERROR_JS_LOAD(5),
    RENDER_ERROR(5000),
    ERROR_LOADING_TIMEOUT(6),
    WHITE_SCREEN_ERROR(MapConstant.LayerPropertyFlag_HeatmapRadius),
    ERROR_BUNDLE_INCOMPLETE(7),
    EXIT_RENDER_INCOMPLETE(MapConstant.LayerPropertyFlag_RasterOpacity),
    ERROR_DEFAULT_CODE(8000);
    
    public static ChangeQuickRedirect a;
    public int Z;

    public static q valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2acb36b1f60b405366abd24842d9573c", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2acb36b1f60b405366abd24842d9573c") : (q) Enum.valueOf(q.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static q[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6500c65996025ec2f413054b78a39083", RobustBitConfig.DEFAULT_VALUE) ? (q[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6500c65996025ec2f413054b78a39083") : (q[]) values().clone();
    }

    q(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e7459b44da3003257fd353fe58c9ad7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e7459b44da3003257fd353fe58c9ad7");
        } else {
            this.Z = i;
        }
    }

    public static ab a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d88ba678e20e6d40375e8476ebcfcea3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ab) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d88ba678e20e6d40375e8476ebcfcea3");
        }
        if (qVar == null) {
            return ab.ERROR_CODE_DEFAULT;
        }
        switch (qVar) {
            case ERROR_CREATE_INSTANCE:
            case ERROR_CREATE_MRN_INSTANCE:
            case LOCAL_BASE_NOT_FOUND:
            case DIO_BASE_READ_ERROR:
            case LOAD_BASE_ERROR:
            case LOAD_BASE_TIMEOUT:
                return ab.ERROR_CODE_CREATE_INSTANCE_FAIL;
            case ERROR_SO_LOAD:
            case LOAD_SO_FAILED:
                return ab.ERROR_CODE_SO_LOAD_FAIL;
            case ERROR_UNZIPFAIL:
            case ERROR_BUNDLE_INCOMPLETE:
            case LOAD_MAIN_BUNDLE_FAILED:
            case LOAD_SUB_BUNDLE_FAILED:
            case DOWNLOAD_OR_UNZIP_FAILED:
            case DD_HTTP_CODE_ERROR:
            case DD_HTTP_FAILED:
            case DD_NO_BUNDLE_INFO:
            case BUNDLE_DOWNLOAD_FAILED:
            case BUNDLE_MD5_VERIFY_FAILED:
            case BUNDLE_UNZIP_FAILED:
            case BUNDLE_FILE_READ_ERROR:
            case EXIT_RENDER_INCOMPLETE:
                return ab.ERROR_CODE_LOAD_BUNDLE_FAIL;
            case ERROR_JS_BUSINESS:
            case RUNTIME_JS_ERROR:
                return ab.ERROR_CODE_RUNTIME_JS_EXCEPTION;
            case ERROR_JS_LOAD:
            case RENDER_ERROR:
            case ERROR_LOADING_TIMEOUT:
            case WHITE_SCREEN_ERROR:
                return ab.ERROR_CODE_RENDER_VIEW_EXCEPTION;
            default:
                return ab.ERROR_CODE_DEFAULT;
        }
    }

    public static q a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e2af18b35e8970ecbb00028bf647134", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e2af18b35e8970ecbb00028bf647134");
        }
        if (i >= DOWNLOAD_OR_UNZIP_FAILED.Z && i < RUNTIME_JS_ERROR.Z) {
            if (i == DOWNLOAD_OR_UNZIP_FAILED.Z) {
                return DOWNLOAD_OR_UNZIP_FAILED;
            }
            if (i == DD_HTTP_CODE_ERROR.Z) {
                return DD_HTTP_CODE_ERROR;
            }
            if (i == DD_HTTP_FAILED.Z) {
                return DD_HTTP_FAILED;
            }
            if (i == DD_NO_BUNDLE_INFO.Z) {
                return DD_NO_BUNDLE_INFO;
            }
            if (i == BUNDLE_DOWNLOAD_FAILED.Z) {
                return BUNDLE_DOWNLOAD_FAILED;
            }
            if (i == BUNDLE_FILE_READ_ERROR.Z) {
                return BUNDLE_FILE_READ_ERROR;
            }
        }
        switch (i) {
            case 1:
                return BUNDLE_SERVICE_ERROR_DOWNLOAD_FILE_LENGTH_ERROR;
            case 2:
                return BUNDLE_SERVICE_ERROR_READ_FILE;
            case 3:
                return BUNDLE_SERVICE_ERROR_VERIFY;
            case 4:
                return BUNDLE_SERVICE_ERROR_PACKAGE;
            case 5:
                return BUNDLE_SERVICE_ERROR_L9_UNZIP;
            case 6:
                return BUNDLE_SERVICE_ERROR_L0_UNZIP;
            case 7:
                return BUNDLE_SERVICE_ERROR_L0_NOT_FOUND;
            case 8:
                return BUNDLE_SERVICE_ERROR_PATCH;
            case 9:
                return BUNDLE_SERVICE_ERROR_DELETE;
            case 10:
                return BUNDLE_SERVICE_ERROR_SET_UP;
            case 11:
                return BUNDLE_SERVICE_ERROR_DOWNLOAD_SAVE;
            case 12:
                return BUNDLE_SERVICE_ERROR_INPUT;
            case 13:
                return BUNDLE_SERVICE_ERROR_DOWNLOAD_INPUT_STREAM_NULL;
            case 14:
                return BUNDLE_SERVICE_ERROR_UNZIP_L0_NOT_EXISTS;
            case 15:
                return BUNDLE_SERVICE_ERROR_SAVE_TARGET_PATH_OCCUPY;
            case 16:
                return BUNDLE_SERVICE_ERROR_SAVE_L0_NOT_FILE;
            case 17:
                return BUNDLE_SERVICE_ERROR_SAVE_MD5_NOT_EQUAL;
            case 18:
                return BUNDLE_SERVICE_ERROR_SAVE_WRITE_L9_EXCEPTION;
            case 19:
                return BUNDLE_SERVICE_ERROR_SAVE_L9_NOT_EXIST;
            case 20:
                return BUNDLE_SERVICE_ERROR_SAVE_NOT_UNZIP_RENAME;
            default:
                return BUNDLE_SERVICE_ERROR_DOWNLOAD;
        }
    }
}
