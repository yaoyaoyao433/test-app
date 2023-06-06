
varying highp vec2 textureCoordinate;
varying highp vec2 textureCoordinate2;

uniform sampler2D inputImageTexture;
uniform sampler2D inputImageTexture2;
uniform sampler2D inputImageTexture3;
uniform sampler2D inputImageTexture4;
uniform highp float divider;
uniform highp float isPortrait;
uniform lowp float hasMediumTex;
uniform lowp float hasRightTex;
uniform lowp float hasLeftTex;
uniform lowp float scrollDirection;
uniform lowp float intensity;

void main()
{
     highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);

     highp float blueColor = textureColor.b * 63.0;
     highp vec2 quad1;
     quad1.y = floor(floor(blueColor) / 8.0);
     quad1.x = floor(blueColor) - (quad1.y * 8.0);
     highp vec2 quad2;
     quad2.y = floor(ceil(blueColor) / 8.0);
     quad2.x = ceil(blueColor) - (quad2.y * 8.0);
     highp vec2 texPos1;
     texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);
     texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);
     highp vec2 texPos2;
     texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);
     texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);
     lowp vec4 mNewColor;
     if(hasMediumTex>0.5){
       lowp vec4 newColor1 = texture2D(inputImageTexture2, texPos1);
       lowp vec4 newColor2 = texture2D(inputImageTexture2, texPos2);
       mNewColor = mix(newColor1, newColor2, fract(blueColor));
     }
     lowp vec4 rNewColor;
     if(hasRightTex>0.5){
       lowp vec4 newColor3 = texture2D(inputImageTexture3, texPos1);
       lowp vec4 newColor4 = texture2D(inputImageTexture3, texPos2);
       rNewColor = mix(newColor3, newColor4, fract(blueColor));
     }
     lowp vec4 lNewColor;
     if(hasLeftTex>0.5){
       lowp vec4 newColor5 = texture2D(inputImageTexture4, texPos1);
       lowp vec4 newColor6 = texture2D(inputImageTexture4, texPos2);
       lNewColor = mix(newColor5, newColor6, fract(blueColor));
     }
     highp float curpos;
     if(isPortrait > 0.5){
           curpos = textureCoordinate.x;
     }else{
           curpos = 1.0 - textureCoordinate.y;
     }

     if(scrollDirection > 0.5){
           if(curpos < divider){
               if(hasMediumTex>0.5){
                   gl_FragColor = mix(textureColor, vec4(mNewColor.rgb, textureColor.w), intensity);
               }else{
                   gl_FragColor = mix(textureColor, vec4(mNewColor.rgb, textureColor.w), 0.0);
              }
           } else {
               if(hasRightTex>0.5){
                   gl_FragColor = mix(textureColor, vec4(rNewColor.rgb, textureColor.w), intensity);
               }else{
                   gl_FragColor = mix(textureColor, vec4(rNewColor.rgb, textureColor.w), 0.0);
               }
           }
     } else {
           if(curpos > divider){
               if(hasMediumTex>0.5){
                   gl_FragColor = mix(textureColor, vec4(mNewColor.rgb, textureColor.w), intensity);
               }else{
                  gl_FragColor = mix(textureColor, vec4(mNewColor.rgb, textureColor.w), 0.0);
               }
           } else {
               if(hasLeftTex>0.5){
                   gl_FragColor = mix(textureColor, vec4(lNewColor.rgb, textureColor.w), intensity);
               }else{
                   gl_FragColor = mix(textureColor, vec4(lNewColor.rgb, textureColor.w), 0.0);
               }
           }
     }

}
