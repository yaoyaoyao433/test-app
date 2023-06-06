package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.webkit.MimeTypeMap;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.meituan.android.mrn.util.b;
import com.meituan.android.privacy.interfaces.Privacy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.f;
/* compiled from: ProGuard */
@ReactModule(name = BlobModule.NAME)
/* loaded from: classes.dex */
public class BlobModule extends ReactContextBaseJavaModule {
    public static final String NAME = "BlobModule";
    private final Map<String, byte[]> mBlobs;
    private final NetworkingModule.b mNetworkingRequestBodyHandler;
    private final NetworkingModule.c mNetworkingResponseHandler;
    private final NetworkingModule.d mNetworkingUriHandler;
    private final WebSocketModule.a mWebSocketContentHandler;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mBlobs = new HashMap();
        this.mWebSocketContentHandler = new WebSocketModule.a() { // from class: com.facebook.react.modules.blob.BlobModule.1
            @Override // com.facebook.react.modules.websocket.WebSocketModule.a
            public final void a(String str, WritableMap writableMap) {
                writableMap.putString("data", str);
            }

            @Override // com.facebook.react.modules.websocket.WebSocketModule.a
            public final void a(f fVar, WritableMap writableMap) {
                byte[] i = fVar.i();
                WritableMap createMap = Arguments.createMap();
                createMap.putString("blobId", BlobModule.this.store(i));
                createMap.putInt("offset", 0);
                createMap.putInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, i.length);
                writableMap.putMap("data", createMap);
                writableMap.putString("type", "blob");
            }
        };
        this.mNetworkingUriHandler = new NetworkingModule.d() { // from class: com.facebook.react.modules.blob.BlobModule.2
            @Override // com.facebook.react.modules.network.NetworkingModule.d
            public final boolean a(Uri uri, String str) {
                String scheme = uri.getScheme();
                return !("http".equals(scheme) || "https".equals(scheme)) && "blob".equals(str);
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.d
            public final WritableMap b(Uri uri, String str) throws IOException {
                byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri, str);
                WritableMap createMap = Arguments.createMap();
                createMap.putString("blobId", BlobModule.this.store(bytesFromUri));
                createMap.putInt("offset", 0);
                createMap.putInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, bytesFromUri.length);
                createMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri, str));
                createMap.putString("name", BlobModule.this.getNameFromUri(uri, str));
                createMap.putDouble("lastModified", BlobModule.this.getLastModifiedFromUri(uri));
                return createMap;
            }
        };
        this.mNetworkingRequestBodyHandler = new NetworkingModule.b() { // from class: com.facebook.react.modules.blob.BlobModule.3
            @Override // com.facebook.react.modules.network.NetworkingModule.b
            public final boolean a(ReadableMap readableMap) {
                return readableMap.hasKey("blob");
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.b
            public final RequestBody a(ReadableMap readableMap, String str) {
                if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
                    str = readableMap.getString("type");
                }
                if (str == null) {
                    str = "application/octet-stream";
                }
                ReadableMap map = readableMap.getMap("blob");
                return RequestBody.create(MediaType.parse(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)));
            }
        };
        this.mNetworkingResponseHandler = new NetworkingModule.c() { // from class: com.facebook.react.modules.blob.BlobModule.4
            @Override // com.facebook.react.modules.network.NetworkingModule.c
            public final boolean a(String str) {
                return "blob".equals(str);
            }

            @Override // com.facebook.react.modules.network.NetworkingModule.c
            public final WritableMap a(ResponseBody responseBody) throws IOException {
                byte[] bytes = responseBody.bytes();
                WritableMap createMap = Arguments.createMap();
                createMap.putString("blobId", BlobModule.this.store(bytes));
                createMap.putInt("offset", 0);
                createMap.putInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, bytes.length);
                return createMap;
            }
        };
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        BlobCollector.a(getReactApplicationContext(), this);
    }

    @Nullable
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier != 0) {
            return c.a("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
        }
        return new HashMap();
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.put(str, bArr);
        }
    }

    @DoNotStrip
    public void remove(String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.remove(str);
        }
    }

    @Nullable
    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    @Nullable
    public byte[] resolve(String str, int i, int i2) {
        synchronized (this.mBlobs) {
            byte[] bArr = this.mBlobs.get(str);
            if (bArr == null) {
                return null;
            }
            if (i2 == -1) {
                i2 = bArr.length - i;
            }
            if (i > 0 || i2 != bArr.length) {
                bArr = Arrays.copyOfRange(bArr, i, i2 + i);
            }
            return bArr;
        }
    }

    @Nullable
    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getBytesFromUri(Uri uri, String str) throws IOException {
        InputStream b;
        if (b.a(uri)) {
            b = b.b(uri).b();
        } else {
            b = Privacy.createContentResolver(getReactApplicationContext(), str).b(uri);
        }
        if (b == null) {
            throw new FileNotFoundException("File not found for " + uri);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = b.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNameFromUri(Uri uri, String str) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor a = Privacy.createContentResolver(getReactApplicationContext(), str).a(uri, new String[]{"_display_name"}, null, null, null);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    return a.getString(0);
                }
            } finally {
                a.close();
            }
        }
        return uri.getLastPathSegment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri, String str) {
        String fileExtensionFromUrl;
        String a = Privacy.createContentResolver(getReactApplicationContext(), str).a(uri);
        if (a == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            a = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return a == null ? "" : a;
    }

    private WebSocketModule getWebSocketModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    @ReactMethod
    public void addNetworkingHandler() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            NetworkingModule networkingModule = (NetworkingModule) reactApplicationContextIfActiveOrWarn.getNativeModule(NetworkingModule.class);
            networkingModule.addUriHandler(this.mNetworkingUriHandler);
            networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
            networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
        }
    }

    @ReactMethod
    public void addWebSocketHandler(double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("addWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, this.mWebSocketContentHandler);
        }
    }

    @ReactMethod
    public void removeWebSocketHandler(double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("removeWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, null);
        }
    }

    @ReactMethod
    public void sendOverSocket(ReadableMap readableMap, double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("sendOverSocket");
        if (webSocketModule != null) {
            byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE));
            if (resolve != null) {
                webSocketModule.sendBinary(f.a(resolve), i);
            } else {
                webSocketModule.sendBinary((f) null, i);
            }
        }
    }

    @ReactMethod
    public void createFromParts(ReadableArray readableArray, String str) {
        char c;
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String string = map.getString("type");
            int hashCode = string.hashCode();
            if (hashCode != -891985903) {
                if (hashCode == 3026845 && string.equals("blob")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (string.equals("string")) {
                    c = 1;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    ReadableMap map2 = map.getMap("data");
                    i += map2.getInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
                    arrayList.add(i2, resolve(map2));
                    break;
                case 1:
                    byte[] bytes = map.getString("data").getBytes(Charset.forName("UTF-8"));
                    i += bytes.length;
                    arrayList.add(i2, bytes);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    @ReactMethod
    public void release(String str) {
        remove(str);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @javax.annotation.Nullable
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }
}
