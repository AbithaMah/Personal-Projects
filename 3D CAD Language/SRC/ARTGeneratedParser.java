import java.io.FileNotFoundException;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.*;
import uk.ac.rhul.cs.csle.art.v3.lex.*;
import uk.ac.rhul.cs.csle.art.v3.manager.*;
import uk.ac.rhul.cs.csle.art.v3.manager.grammar.*;
import uk.ac.rhul.cs.csle.art.v3.manager.mode.*;
import uk.ac.rhul.cs.csle.art.util.*;
import uk.ac.rhul.cs.csle.art.util.text.*;
import uk.ac.rhul.cs.csle.art.v3.value.*;
import uk.ac.rhul.cs.csle.art.term.*;
import uk.ac.rhul.cs.csle.art.value.*;
/*******************************************************************************
*
* ARTGeneratedParser.java
*
*******************************************************************************/
@SuppressWarnings("fallthrough") public class ARTGeneratedParser extends ARTGLLParserHashPool {
  private String artInputString; // This is used in the MGLL generated parser instead of artlexer.artinputString
  private static boolean[] ARTSet1;
  private static boolean[] ARTSet2;
  private static boolean[] ARTSet3;
  private static boolean[] ARTSet4;
  private static boolean[] ARTSet5;
  private static boolean[] ARTSet6;
  private static boolean[] ARTSet7;
  private static boolean[] ARTSet8;
  private static boolean[] ARTSet9;
  private static boolean[] ARTSet10;
  private static boolean[] ARTSet11;
  private static boolean[] ARTSet12;
  private static boolean[] ARTSet13;
  private static boolean[] ARTSet14;
  private static boolean[] ARTSet15;
  private static boolean[] ARTSet16;
  private static boolean[] ARTSet17;
  private static boolean[] ARTSet18;
  private static boolean[] ARTSet19;
  private static boolean[] ARTSet20;
  private static boolean[] ARTSet21;
  private static boolean[] ARTSet22;
  private static boolean[] ARTSet23;
  private static boolean[] ARTSet24;
  private static boolean[] ARTSet25;
  private static boolean[] ARTSet26;
  private static boolean[] ARTSet27;
  private static boolean[] ARTSet28;
  private static boolean[] ARTSet29;
  private static boolean[] ARTSet30;
  private static boolean[] ARTSet31;
  private static boolean[] ARTSet32;
  private static boolean[] ARTSet33;
  private static boolean[] ARTSet34;
  private static boolean[] ARTSet35;
  private static boolean[] ARTSet36;
  private static boolean[] ARTSet37;
  private static boolean[] ARTSet38;
  private static boolean[] ARTSet39;
  private static boolean[] ARTSet40;
  private static boolean[] ARTSet41;
  private static boolean[] ARTSet42;
  private static boolean[] ARTSet43;
  private static boolean[] ARTSet44;
  private static boolean[] ARTSet45;
  private static boolean[] ARTSet46;
  private static boolean[] ARTSet47;
  private static boolean[] ARTSet48;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_INTEGER = 2;
  public static final int ARTTB_SIMPLE_WHITESPACE = 3;
  public static final int ARTTS__SHREIK_EQUAL = 4;
  public static final int ARTTS__LPAR = 5;
  public static final int ARTTS__RPAR = 6;
  public static final int ARTTS__STAR = 7;
  public static final int ARTTS__PLUS = 8;
  public static final int ARTTS__COMMA = 9;
  public static final int ARTTS__MINUS = 10;
  public static final int ARTTS__MINUS_GT = 11;
  public static final int ARTTS__COLON = 12;
  public static final int ARTTS__SEMICOLON = 13;
  public static final int ARTTS__LT = 14;
  public static final int ARTTS__LT_MINUS = 15;
  public static final int ARTTS__LT_EQUAL = 16;
  public static final int ARTTS__GT = 17;
  public static final int ARTTS__GT_EQUAL = 18;
  public static final int ARTTS_changeColour = 19;
  public static final int ARTTS_cube = 20;
  public static final int ARTTS_cuboid = 21;
  public static final int ARTTS_cylinder = 22;
  public static final int ARTTS_display = 23;
  public static final int ARTTS_duplicate = 24;
  public static final int ARTTS_else = 25;
  public static final int ARTTS_end = 26;
  public static final int ARTTS_for = 27;
  public static final int ARTTS_if = 28;
  public static final int ARTTS_scale = 29;
  public static final int ARTTS_sphere = 30;
  public static final int ARTTS_translate = 31;
  public static final int ARTTS_while = 32;
  public static final int ARTTS__BAR = 33;
  public static final int ARTX_EPSILON = 34;
  public static final int ARTL_ART_ID = 35;
  public static final int ARTL_ART_INTEGER = 36;
  public static final int ARTL_ART_condition = 37;
  public static final int ARTL_ART_expression = 38;
  public static final int ARTL_ART_operand = 39;
  public static final int ARTL_ART_statement = 40;
  public static final int ARTL_ART_statements = 41;
  public static final int ARTL_ART_ID_341 = 42;
  public static final int ARTL_ART_ID_342 = 43;
  public static final int ARTL_ART_ID_343 = 44;
  public static final int ARTL_ART_ID_344 = 45;
  public static final int ARTL_ART_INTEGER_347 = 46;
  public static final int ARTL_ART_INTEGER_348 = 47;
  public static final int ARTL_ART_INTEGER_349 = 48;
  public static final int ARTL_ART_INTEGER_350 = 49;
  public static final int ARTL_ART_condition_167 = 50;
  public static final int ARTL_ART_condition_168 = 51;
  public static final int ARTL_ART_condition_169 = 52;
  public static final int ARTL_ART_condition_170 = 53;
  public static final int ARTL_ART_condition_173 = 54;
  public static final int ARTL_ART_condition_174 = 55;
  public static final int ARTL_ART_condition_175 = 56;
  public static final int ARTL_ART_condition_176 = 57;
  public static final int ARTL_ART_condition_177 = 58;
  public static final int ARTL_ART_condition_178 = 59;
  public static final int ARTL_ART_condition_179 = 60;
  public static final int ARTL_ART_condition_180 = 61;
  public static final int ARTL_ART_condition_183 = 62;
  public static final int ARTL_ART_condition_184 = 63;
  public static final int ARTL_ART_condition_185 = 64;
  public static final int ARTL_ART_condition_186 = 65;
  public static final int ARTL_ART_condition_187 = 66;
  public static final int ARTL_ART_condition_188 = 67;
  public static final int ARTL_ART_condition_189 = 68;
  public static final int ARTL_ART_condition_190 = 69;
  public static final int ARTL_ART_condition_193 = 70;
  public static final int ARTL_ART_condition_194 = 71;
  public static final int ARTL_ART_condition_195 = 72;
  public static final int ARTL_ART_condition_196 = 73;
  public static final int ARTL_ART_condition_197 = 74;
  public static final int ARTL_ART_condition_198 = 75;
  public static final int ARTL_ART_condition_199 = 76;
  public static final int ARTL_ART_condition_200 = 77;
  public static final int ARTL_ART_condition_203 = 78;
  public static final int ARTL_ART_condition_204 = 79;
  public static final int ARTL_ART_condition_205 = 80;
  public static final int ARTL_ART_condition_206 = 81;
  public static final int ARTL_ART_condition_207 = 82;
  public static final int ARTL_ART_condition_208 = 83;
  public static final int ARTL_ART_condition_209 = 84;
  public static final int ARTL_ART_condition_210 = 85;
  public static final int ARTL_ART_condition_213 = 86;
  public static final int ARTL_ART_condition_214 = 87;
  public static final int ARTL_ART_condition_215 = 88;
  public static final int ARTL_ART_condition_216 = 89;
  public static final int ARTL_ART_condition_217 = 90;
  public static final int ARTL_ART_condition_218 = 91;
  public static final int ARTL_ART_condition_219 = 92;
  public static final int ARTL_ART_condition_220 = 93;
  public static final int ARTL_ART_expression_223 = 94;
  public static final int ARTL_ART_expression_224 = 95;
  public static final int ARTL_ART_expression_225 = 96;
  public static final int ARTL_ART_expression_226 = 97;
  public static final int ARTL_ART_expression_229 = 98;
  public static final int ARTL_ART_expression_230 = 99;
  public static final int ARTL_ART_expression_231 = 100;
  public static final int ARTL_ART_expression_232 = 101;
  public static final int ARTL_ART_expression_233 = 102;
  public static final int ARTL_ART_expression_234 = 103;
  public static final int ARTL_ART_expression_235 = 104;
  public static final int ARTL_ART_expression_236 = 105;
  public static final int ARTL_ART_expression_237 = 106;
  public static final int ARTL_ART_expression_238 = 107;
  public static final int ARTL_ART_expression_241 = 108;
  public static final int ARTL_ART_expression_242 = 109;
  public static final int ARTL_ART_expression_243 = 110;
  public static final int ARTL_ART_expression_244 = 111;
  public static final int ARTL_ART_expression_245 = 112;
  public static final int ARTL_ART_expression_246 = 113;
  public static final int ARTL_ART_expression_247 = 114;
  public static final int ARTL_ART_expression_248 = 115;
  public static final int ARTL_ART_expression_249 = 116;
  public static final int ARTL_ART_expression_250 = 117;
  public static final int ARTL_ART_expression_253 = 118;
  public static final int ARTL_ART_expression_254 = 119;
  public static final int ARTL_ART_expression_255 = 120;
  public static final int ARTL_ART_expression_256 = 121;
  public static final int ARTL_ART_expression_257 = 122;
  public static final int ARTL_ART_expression_258 = 123;
  public static final int ARTL_ART_expression_259 = 124;
  public static final int ARTL_ART_expression_260 = 125;
  public static final int ARTL_ART_expression_261 = 126;
  public static final int ARTL_ART_expression_262 = 127;
  public static final int ARTL_ART_expression_263 = 128;
  public static final int ARTL_ART_expression_264 = 129;
  public static final int ARTL_ART_expression_265 = 130;
  public static final int ARTL_ART_expression_266 = 131;
  public static final int ARTL_ART_expression_267 = 132;
  public static final int ARTL_ART_expression_268 = 133;
  public static final int ARTL_ART_expression_269 = 134;
  public static final int ARTL_ART_expression_270 = 135;
  public static final int ARTL_ART_expression_273 = 136;
  public static final int ARTL_ART_expression_274 = 137;
  public static final int ARTL_ART_expression_275 = 138;
  public static final int ARTL_ART_expression_276 = 139;
  public static final int ARTL_ART_expression_277 = 140;
  public static final int ARTL_ART_expression_278 = 141;
  public static final int ARTL_ART_expression_279 = 142;
  public static final int ARTL_ART_expression_280 = 143;
  public static final int ARTL_ART_expression_281 = 144;
  public static final int ARTL_ART_expression_282 = 145;
  public static final int ARTL_ART_expression_283 = 146;
  public static final int ARTL_ART_expression_284 = 147;
  public static final int ARTL_ART_expression_285 = 148;
  public static final int ARTL_ART_expression_286 = 149;
  public static final int ARTL_ART_expression_289 = 150;
  public static final int ARTL_ART_expression_290 = 151;
  public static final int ARTL_ART_expression_291 = 152;
  public static final int ARTL_ART_expression_292 = 153;
  public static final int ARTL_ART_expression_293 = 154;
  public static final int ARTL_ART_expression_294 = 155;
  public static final int ARTL_ART_expression_295 = 156;
  public static final int ARTL_ART_expression_296 = 157;
  public static final int ARTL_ART_expression_299 = 158;
  public static final int ARTL_ART_expression_300 = 159;
  public static final int ARTL_ART_expression_301 = 160;
  public static final int ARTL_ART_expression_302 = 161;
  public static final int ARTL_ART_expression_303 = 162;
  public static final int ARTL_ART_expression_304 = 163;
  public static final int ARTL_ART_expression_305 = 164;
  public static final int ARTL_ART_expression_306 = 165;
  public static final int ARTL_ART_expression_309 = 166;
  public static final int ARTL_ART_expression_310 = 167;
  public static final int ARTL_ART_expression_311 = 168;
  public static final int ARTL_ART_expression_312 = 169;
  public static final int ARTL_ART_expression_313 = 170;
  public static final int ARTL_ART_expression_314 = 171;
  public static final int ARTL_ART_expression_315 = 172;
  public static final int ARTL_ART_expression_316 = 173;
  public static final int ARTL_ART_operand_319 = 174;
  public static final int ARTL_ART_operand_320 = 175;
  public static final int ARTL_ART_operand_321 = 176;
  public static final int ARTL_ART_operand_322 = 177;
  public static final int ARTL_ART_operand_325 = 178;
  public static final int ARTL_ART_operand_326 = 179;
  public static final int ARTL_ART_operand_327 = 180;
  public static final int ARTL_ART_operand_328 = 181;
  public static final int ARTL_ART_operand_331 = 182;
  public static final int ARTL_ART_operand_332 = 183;
  public static final int ARTL_ART_operand_333 = 184;
  public static final int ARTL_ART_operand_334 = 185;
  public static final int ARTL_ART_operand_335 = 186;
  public static final int ARTL_ART_operand_336 = 187;
  public static final int ARTL_ART_operand_337 = 188;
  public static final int ARTL_ART_operand_338 = 189;
  public static final int ARTL_ART_statement_11 = 190;
  public static final int ARTL_ART_statement_12 = 191;
  public static final int ARTL_ART_statement_13 = 192;
  public static final int ARTL_ART_statement_14 = 193;
  public static final int ARTL_ART_statement_15 = 194;
  public static final int ARTL_ART_statement_16 = 195;
  public static final int ARTL_ART_statement_17 = 196;
  public static final int ARTL_ART_statement_18 = 197;
  public static final int ARTL_ART_statement_19 = 198;
  public static final int ARTL_ART_statement_20 = 199;
  public static final int ARTL_ART_statement_23 = 200;
  public static final int ARTL_ART_statement_24 = 201;
  public static final int ARTL_ART_statement_25 = 202;
  public static final int ARTL_ART_statement_26 = 203;
  public static final int ARTL_ART_statement_27 = 204;
  public static final int ARTL_ART_statement_28 = 205;
  public static final int ARTL_ART_statement_29 = 206;
  public static final int ARTL_ART_statement_30 = 207;
  public static final int ARTL_ART_statement_31 = 208;
  public static final int ARTL_ART_statement_32 = 209;
  public static final int ARTL_ART_statement_33 = 210;
  public static final int ARTL_ART_statement_34 = 211;
  public static final int ARTL_ART_statement_35 = 212;
  public static final int ARTL_ART_statement_36 = 213;
  public static final int ARTL_ART_statement_37 = 214;
  public static final int ARTL_ART_statement_38 = 215;
  public static final int ARTL_ART_statement_41 = 216;
  public static final int ARTL_ART_statement_42 = 217;
  public static final int ARTL_ART_statement_43 = 218;
  public static final int ARTL_ART_statement_44 = 219;
  public static final int ARTL_ART_statement_45 = 220;
  public static final int ARTL_ART_statement_46 = 221;
  public static final int ARTL_ART_statement_47 = 222;
  public static final int ARTL_ART_statement_48 = 223;
  public static final int ARTL_ART_statement_51 = 224;
  public static final int ARTL_ART_statement_52 = 225;
  public static final int ARTL_ART_statement_53 = 226;
  public static final int ARTL_ART_statement_54 = 227;
  public static final int ARTL_ART_statement_55 = 228;
  public static final int ARTL_ART_statement_56 = 229;
  public static final int ARTL_ART_statement_57 = 230;
  public static final int ARTL_ART_statement_58 = 231;
  public static final int ARTL_ART_statement_59 = 232;
  public static final int ARTL_ART_statement_60 = 233;
  public static final int ARTL_ART_statement_61 = 234;
  public static final int ARTL_ART_statement_62 = 235;
  public static final int ARTL_ART_statement_63 = 236;
  public static final int ARTL_ART_statement_64 = 237;
  public static final int ARTL_ART_statement_65 = 238;
  public static final int ARTL_ART_statement_66 = 239;
  public static final int ARTL_ART_statement_69 = 240;
  public static final int ARTL_ART_statement_70 = 241;
  public static final int ARTL_ART_statement_71 = 242;
  public static final int ARTL_ART_statement_72 = 243;
  public static final int ARTL_ART_statement_73 = 244;
  public static final int ARTL_ART_statement_74 = 245;
  public static final int ARTL_ART_statement_75 = 246;
  public static final int ARTL_ART_statement_76 = 247;
  public static final int ARTL_ART_statement_77 = 248;
  public static final int ARTL_ART_statement_78 = 249;
  public static final int ARTL_ART_statement_81 = 250;
  public static final int ARTL_ART_statement_82 = 251;
  public static final int ARTL_ART_statement_83 = 252;
  public static final int ARTL_ART_statement_84 = 253;
  public static final int ARTL_ART_statement_85 = 254;
  public static final int ARTL_ART_statement_86 = 255;
  public static final int ARTL_ART_statement_87 = 256;
  public static final int ARTL_ART_statement_88 = 257;
  public static final int ARTL_ART_statement_89 = 258;
  public static final int ARTL_ART_statement_90 = 259;
  public static final int ARTL_ART_statement_91 = 260;
  public static final int ARTL_ART_statement_92 = 261;
  public static final int ARTL_ART_statement_93 = 262;
  public static final int ARTL_ART_statement_94 = 263;
  public static final int ARTL_ART_statement_95 = 264;
  public static final int ARTL_ART_statement_96 = 265;
  public static final int ARTL_ART_statement_97 = 266;
  public static final int ARTL_ART_statement_98 = 267;
  public static final int ARTL_ART_statement_99 = 268;
  public static final int ARTL_ART_statement_100 = 269;
  public static final int ARTL_ART_statement_103 = 270;
  public static final int ARTL_ART_statement_104 = 271;
  public static final int ARTL_ART_statement_105 = 272;
  public static final int ARTL_ART_statement_106 = 273;
  public static final int ARTL_ART_statement_107 = 274;
  public static final int ARTL_ART_statement_108 = 275;
  public static final int ARTL_ART_statement_109 = 276;
  public static final int ARTL_ART_statement_110 = 277;
  public static final int ARTL_ART_statement_111 = 278;
  public static final int ARTL_ART_statement_112 = 279;
  public static final int ARTL_ART_statement_113 = 280;
  public static final int ARTL_ART_statement_114 = 281;
  public static final int ARTL_ART_statement_115 = 282;
  public static final int ARTL_ART_statement_116 = 283;
  public static final int ARTL_ART_statement_117 = 284;
  public static final int ARTL_ART_statement_118 = 285;
  public static final int ARTL_ART_statement_121 = 286;
  public static final int ARTL_ART_statement_122 = 287;
  public static final int ARTL_ART_statement_123 = 288;
  public static final int ARTL_ART_statement_124 = 289;
  public static final int ARTL_ART_statement_125 = 290;
  public static final int ARTL_ART_statement_126 = 291;
  public static final int ARTL_ART_statement_127 = 292;
  public static final int ARTL_ART_statement_128 = 293;
  public static final int ARTL_ART_statement_129 = 294;
  public static final int ARTL_ART_statement_130 = 295;
  public static final int ARTL_ART_statement_131 = 296;
  public static final int ARTL_ART_statement_132 = 297;
  public static final int ARTL_ART_statement_133 = 298;
  public static final int ARTL_ART_statement_134 = 299;
  public static final int ARTL_ART_statement_137 = 300;
  public static final int ARTL_ART_statement_138 = 301;
  public static final int ARTL_ART_statement_139 = 302;
  public static final int ARTL_ART_statement_140 = 303;
  public static final int ARTL_ART_statement_141 = 304;
  public static final int ARTL_ART_statement_142 = 305;
  public static final int ARTL_ART_statement_143 = 306;
  public static final int ARTL_ART_statement_144 = 307;
  public static final int ARTL_ART_statement_145 = 308;
  public static final int ARTL_ART_statement_146 = 309;
  public static final int ARTL_ART_statement_147 = 310;
  public static final int ARTL_ART_statement_148 = 311;
  public static final int ARTL_ART_statement_149 = 312;
  public static final int ARTL_ART_statement_150 = 313;
  public static final int ARTL_ART_statement_151 = 314;
  public static final int ARTL_ART_statement_152 = 315;
  public static final int ARTL_ART_statement_153 = 316;
  public static final int ARTL_ART_statement_154 = 317;
  public static final int ARTL_ART_statement_155 = 318;
  public static final int ARTL_ART_statement_156 = 319;
  public static final int ARTL_ART_statement_157 = 320;
  public static final int ARTL_ART_statement_158 = 321;
  public static final int ARTL_ART_statement_159 = 322;
  public static final int ARTL_ART_statement_160 = 323;
  public static final int ARTL_ART_statement_161 = 324;
  public static final int ARTL_ART_statement_162 = 325;
  public static final int ARTL_ART_statement_163 = 326;
  public static final int ARTL_ART_statement_164 = 327;
  public static final int ARTL_ART_statements_1 = 328;
  public static final int ARTL_ART_statements_2 = 329;
  public static final int ARTL_ART_statements_3 = 330;
  public static final int ARTL_ART_statements_4 = 331;
  public static final int ARTL_ART_statements_5 = 332;
  public static final int ARTL_ART_statements_6 = 333;
  public static final int ARTL_ART_statements_7 = 334;
  public static final int ARTL_ART_statements_8 = 335;
  public static final int ARTL_ART_statements_9 = 336;
  public static final int ARTL_ART_statements_10 = 337;
  public static final int ARTX_DESPATCH = 338;
  public static final int ARTX_DUMMY = 339;
  public static final int ARTX_LABEL_EXTENT = 340;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_ID() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ID production descriptor loads*/
      case ARTL_ART_ID: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ID_342, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_342: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_344, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_INTEGER() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal INTEGER production descriptor loads*/
      case ARTL_ART_INTEGER: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_INTEGER_348, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal INTEGER: match production*/
      case ARTL_ART_INTEGER_348: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_INTEGER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_INTEGER_350, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_condition() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal condition production descriptor loads*/
      case ARTL_ART_condition: 
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condition_168, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condition_174, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condition_184, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condition_194, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condition_204, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_condition_214, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal condition: match production*/
      case ARTL_ART_condition_168: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_170, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_condition_170: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condition: match production*/
      case ARTL_ART_condition_174: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_176, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condition; return; }
      case ARTL_ART_condition_176: 
        /* Nonterminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_condition_178, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_180, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_condition_180: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condition: match production*/
      case ARTL_ART_condition_184: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_186, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condition; return; }
      case ARTL_ART_condition_186: 
        /* Nonterminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_condition_188, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_190, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_condition_190: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condition: match production*/
      case ARTL_ART_condition_194: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_196, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condition; return; }
      case ARTL_ART_condition_196: 
        /* Nonterminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_condition_198, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_200, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_condition_200: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condition: match production*/
      case ARTL_ART_condition_204: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_206, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condition; return; }
      case ARTL_ART_condition_206: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_condition_208, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_210, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_condition_210: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal condition: match production*/
      case ARTL_ART_condition_214: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_216, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condition; return; }
      case ARTL_ART_condition_216: 
        /* Nonterminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_condition_218, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_condition_220, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_condition_220: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_expression() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal expression production descriptor loads*/
      case ARTL_ART_expression: 
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_expression_224, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_expression_230, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_expression_242, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_expression_254, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_expression_274, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_expression_290, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_expression_300, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_expression_310, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal expression: match production*/
      case ARTL_ART_expression_224: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_226, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_expression_226: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal expression: match production*/
      case ARTL_ART_expression_230: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_sphere, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_232, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_234, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_236, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_236: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_238, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal expression: match production*/
      case ARTL_ART_expression_242: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_cube, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_244, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_246, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_248, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_248: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_250, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal expression: match production*/
      case ARTL_ART_expression_254: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_cuboid, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_256, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_258, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_260, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_260: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_262, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_264, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_264: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_266, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_268, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_268: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_270, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal expression: match production*/
      case ARTL_ART_expression_274: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_cylinder, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_276, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_278, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_280, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_280: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_282, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_284, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_284: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_286, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal expression: match production*/
      case ARTL_ART_expression_290: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_292, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_292: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_294, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_296, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_expression_296: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal expression: match production*/
      case ARTL_ART_expression_300: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_302, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_302: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__PLUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_304, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_306, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_expression_306: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal expression: match production*/
      case ARTL_ART_expression_310: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_312, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_expression_312: 
        /* Nonterminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__STAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_expression_314, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_expression_316, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_operand; return; }
      case ARTL_ART_expression_316: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_operand() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal operand production descriptor loads*/
      case ARTL_ART_operand: 
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_320, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_326, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_operand_332, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_320: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_322, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_operand_322: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_326: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_328, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_INTEGER; return; }
      case ARTL_ART_operand_328: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal operand: match production*/
      case ARTL_ART_operand_332: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_334, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_operand_336, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_operand_336: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_operand_338, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statement production descriptor loads*/
      case ARTL_ART_statement: 
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_12, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_24, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_42, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet38[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_52, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet42[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_70, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_82, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_104, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_122, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statement_138, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_12: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_14, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_statement_14: 
        /* Nonterminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT_MINUS, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_16, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_18, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_18: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_20, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_24: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_if, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_26, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_28, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condition; return; }
      case ARTL_ART_statement_28: 
        /* Nonterminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_30, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_32, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_32: 
        /* Nonterminal template end */
        if (!ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_else, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_34, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_36, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_38, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_38: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_42: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_while, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_44, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condition; return; }
      case ARTL_ART_statement_46: 
        /* Nonterminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_48, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_48: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_52: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_for, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_54, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_condition; return; }
      case ARTL_ART_statement_56: 
        /* Nonterminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__BAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_58, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_60, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statement_60: 
        /* Nonterminal template end */
        if (!ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__BAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_62, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_64, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_statement_64: 
        /* Nonterminal template end */
        if (!ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_end, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_66, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_70: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_display, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_72, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_74, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_76, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_78, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_82: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_84, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_84: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS_GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_86, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_translate, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_88, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_90, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_92, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_92: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_94, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_96: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_98, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_100, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_104: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_106: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS_GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_108, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet45[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_scale, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_110, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_112, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_114, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_114: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_116, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_118, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_122: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_124, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_124: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS_GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_126, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_duplicate, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_128, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_130, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_132, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_134, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statement: match production*/
      case ARTL_ART_statement_138: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_140, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_140: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS_GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_142, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_changeColour, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_144, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_146, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_148, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_148: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_150, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_152, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_152: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_154, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_156, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_156: 
        /* Nonterminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_158, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statement_160, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_expression; return; }
      case ARTL_ART_statement_160: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_162, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_statement_164, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_statements() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal statements production descriptor loads*/
      case ARTL_ART_statements: 
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet35[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_statements_6, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statements_4: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal statements: match production*/
      case ARTL_ART_statements_6: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_8, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statement; return; }
      case ARTL_ART_statements_8: 
        /* Nonterminal template end */
        if (!ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_statements_10, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_statements; return; }
      case ARTL_ART_statements_10: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 42;
    artLexicaliseForV3GLL(artInputString, null);
    artLexCompleteTime = artReadClock();
    artDummySPPFNode = artFindSPPFInitial(ARTL_DUMMY, 0, 0);
    artCurrentSPPFNode = artDummySPPFNode;
    artRootGSSNode = artFindGSS(ARTL_EOS, 0, 0, 0);
    artCurrentGSSNode = artRootGSSNode;
    artCurrentRestartLabel = artStartSymbolLabel;
    artCurrentInputPairIndex = 0;
    artCurrentInputPairReference = 0;
    while (true)
      switch (artlhsL[artCurrentRestartLabel]) {
        case ARTL_ART_ID: 
          ARTPF_ART_ID();
          break;
        case ARTL_ART_INTEGER: 
          ARTPF_ART_INTEGER();
          break;
        case ARTL_ART_condition: 
          ARTPF_ART_condition();
          break;
        case ARTL_ART_expression: 
          ARTPF_ART_expression();
          break;
        case ARTL_ART_operand: 
          ARTPF_ART_operand();
          break;
        case ARTL_ART_statement: 
          ARTPF_ART_statement();
          break;
        case ARTL_ART_statements: 
          ARTPF_ART_statements();
          break;
        case ARTX_DESPATCH: 
          if (artNoDescriptors()) { 
            artCheckAcceptance();
            artParseCompleteTime = artReadClock();
            return;
           }
          artUnloadDescriptor();
      }
  }

  public void ARTSet1initialise() {
    ARTSet1 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet1, 0, artSetExtent, false);
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTB_ID] = true;
    ARTSet6[ARTTB_INTEGER] = true;
    ARTSet6[ARTTS__SHREIK_EQUAL] = true;
    ARTSet6[ARTTS__LPAR] = true;
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__STAR] = true;
    ARTSet6[ARTTS__PLUS] = true;
    ARTSet6[ARTTS__COMMA] = true;
    ARTSet6[ARTTS__MINUS] = true;
    ARTSet6[ARTTS__MINUS_GT] = true;
    ARTSet6[ARTTS__COLON] = true;
    ARTSet6[ARTTS__SEMICOLON] = true;
    ARTSet6[ARTTS__LT] = true;
    ARTSet6[ARTTS__LT_EQUAL] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS__GT_EQUAL] = true;
    ARTSet6[ARTTS_cube] = true;
    ARTSet6[ARTTS_cuboid] = true;
    ARTSet6[ARTTS_cylinder] = true;
    ARTSet6[ARTTS_display] = true;
    ARTSet6[ARTTS_for] = true;
    ARTSet6[ARTTS_if] = true;
    ARTSet6[ARTTS_sphere] = true;
    ARTSet6[ARTTS_while] = true;
    ARTSet6[ARTTS__BAR] = true;
    ARTSet6[ARTL_ART_ID] = true;
    ARTSet6[ARTL_ART_INTEGER] = true;
    ARTSet6[ARTL_ART_expression] = true;
    ARTSet6[ARTL_ART_operand] = true;
    ARTSet6[ARTL_ART_statement] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTB_ID] = true;
    ARTSet15[ARTTB_INTEGER] = true;
    ARTSet15[ARTTS__LPAR] = true;
    ARTSet15[ARTL_ART_ID] = true;
    ARTSet15[ARTL_ART_INTEGER] = true;
    ARTSet15[ARTL_ART_operand] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS_for] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTB_ID] = true;
    ARTSet27[ARTL_ART_ID] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTB_INTEGER] = true;
    ARTSet28[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS_scale] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTS_translate] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTB_ID] = true;
    ARTSet9[ARTTB_INTEGER] = true;
    ARTSet9[ARTTS__LPAR] = true;
    ARTSet9[ARTTS_cube] = true;
    ARTSet9[ARTTS_cuboid] = true;
    ARTSet9[ARTTS_cylinder] = true;
    ARTSet9[ARTTS_sphere] = true;
    ARTSet9[ARTL_ART_ID] = true;
    ARTSet9[ARTL_ART_INTEGER] = true;
    ARTSet9[ARTL_ART_expression] = true;
    ARTSet9[ARTL_ART_operand] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTS_while] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS_sphere] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTB_ID] = true;
    ARTSet3[ARTTB_INTEGER] = true;
    ARTSet3[ARTTS__SHREIK_EQUAL] = true;
    ARTSet3[ARTTS__LPAR] = true;
    ARTSet3[ARTTS__RPAR] = true;
    ARTSet3[ARTTS__STAR] = true;
    ARTSet3[ARTTS__PLUS] = true;
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__MINUS] = true;
    ARTSet3[ARTTS__MINUS_GT] = true;
    ARTSet3[ARTTS__COLON] = true;
    ARTSet3[ARTTS__SEMICOLON] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__LT_MINUS] = true;
    ARTSet3[ARTTS__LT_EQUAL] = true;
    ARTSet3[ARTTS__GT] = true;
    ARTSet3[ARTTS__GT_EQUAL] = true;
    ARTSet3[ARTTS_cube] = true;
    ARTSet3[ARTTS_cuboid] = true;
    ARTSet3[ARTTS_cylinder] = true;
    ARTSet3[ARTTS_display] = true;
    ARTSet3[ARTTS_for] = true;
    ARTSet3[ARTTS_if] = true;
    ARTSet3[ARTTS_sphere] = true;
    ARTSet3[ARTTS_while] = true;
    ARTSet3[ARTTS__BAR] = true;
    ARTSet3[ARTL_ART_ID] = true;
    ARTSet3[ARTL_ART_INTEGER] = true;
    ARTSet3[ARTL_ART_expression] = true;
    ARTSet3[ARTL_ART_operand] = true;
    ARTSet3[ARTL_ART_statement] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTS_end] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTX_EOS] = true;
    ARTSet30[ARTTB_ID] = true;
    ARTSet30[ARTTB_INTEGER] = true;
    ARTSet30[ARTTS__LPAR] = true;
    ARTSet30[ARTTS_cube] = true;
    ARTSet30[ARTTS_cuboid] = true;
    ARTSet30[ARTTS_cylinder] = true;
    ARTSet30[ARTTS_display] = true;
    ARTSet30[ARTTS_else] = true;
    ARTSet30[ARTTS_end] = true;
    ARTSet30[ARTTS_for] = true;
    ARTSet30[ARTTS_if] = true;
    ARTSet30[ARTTS_sphere] = true;
    ARTSet30[ARTTS_while] = true;
    ARTSet30[ARTTS__BAR] = true;
    ARTSet30[ARTL_ART_ID] = true;
    ARTSet30[ARTL_ART_INTEGER] = true;
    ARTSet30[ARTL_ART_expression] = true;
    ARTSet30[ARTL_ART_operand] = true;
    ARTSet30[ARTL_ART_statement] = true;
    ARTSet30[ARTL_ART_statements] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTS_cuboid] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS_if] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS_else] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTS_display] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTX_EOS] = true;
    ARTSet48[ARTTS_end] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_INTEGER] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS_cube] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTB_ID] = true;
    ARTSet40[ARTTB_INTEGER] = true;
    ARTSet40[ARTTS__LPAR] = true;
    ARTSet40[ARTTS_cube] = true;
    ARTSet40[ARTTS_cuboid] = true;
    ARTSet40[ARTTS_cylinder] = true;
    ARTSet40[ARTTS_display] = true;
    ARTSet40[ARTTS_for] = true;
    ARTSet40[ARTTS_if] = true;
    ARTSet40[ARTTS_sphere] = true;
    ARTSet40[ARTTS_while] = true;
    ARTSet40[ARTL_ART_ID] = true;
    ARTSet40[ARTL_ART_INTEGER] = true;
    ARTSet40[ARTL_ART_expression] = true;
    ARTSet40[ARTL_ART_operand] = true;
    ARTSet40[ARTL_ART_statement] = true;
    ARTSet40[ARTL_ART_statements] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTB_ID] = true;
    ARTSet29[ARTTB_INTEGER] = true;
    ARTSet29[ARTTS__LPAR] = true;
    ARTSet29[ARTTS_cube] = true;
    ARTSet29[ARTTS_cuboid] = true;
    ARTSet29[ARTTS_cylinder] = true;
    ARTSet29[ARTTS_display] = true;
    ARTSet29[ARTTS_for] = true;
    ARTSet29[ARTTS_if] = true;
    ARTSet29[ARTTS_sphere] = true;
    ARTSet29[ARTTS_while] = true;
    ARTSet29[ARTL_ART_ID] = true;
    ARTSet29[ARTL_ART_INTEGER] = true;
    ARTSet29[ARTL_ART_expression] = true;
    ARTSet29[ARTL_ART_operand] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_ID] = true;
    ARTSet7[ARTTB_INTEGER] = true;
    ARTSet7[ARTTS__LPAR] = true;
    ARTSet7[ARTTS_cube] = true;
    ARTSet7[ARTTS_cuboid] = true;
    ARTSet7[ARTTS_cylinder] = true;
    ARTSet7[ARTTS_sphere] = true;
    ARTSet7[ARTL_ART_ID] = true;
    ARTSet7[ARTL_ART_INTEGER] = true;
    ARTSet7[ARTL_ART_condition] = true;
    ARTSet7[ARTL_ART_expression] = true;
    ARTSet7[ARTL_ART_operand] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS__LPAR] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__RPAR] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_ID] = true;
    ARTSet8[ARTTB_INTEGER] = true;
    ARTSet8[ARTTS__SHREIK_EQUAL] = true;
    ARTSet8[ARTTS__LPAR] = true;
    ARTSet8[ARTTS__COLON] = true;
    ARTSet8[ARTTS__LT] = true;
    ARTSet8[ARTTS__LT_EQUAL] = true;
    ARTSet8[ARTTS__GT] = true;
    ARTSet8[ARTTS__GT_EQUAL] = true;
    ARTSet8[ARTTS_cube] = true;
    ARTSet8[ARTTS_cuboid] = true;
    ARTSet8[ARTTS_cylinder] = true;
    ARTSet8[ARTTS_display] = true;
    ARTSet8[ARTTS_for] = true;
    ARTSet8[ARTTS_if] = true;
    ARTSet8[ARTTS_sphere] = true;
    ARTSet8[ARTTS_while] = true;
    ARTSet8[ARTTS__BAR] = true;
    ARTSet8[ARTL_ART_ID] = true;
    ARTSet8[ARTL_ART_INTEGER] = true;
    ARTSet8[ARTL_ART_expression] = true;
    ARTSet8[ARTL_ART_operand] = true;
    ARTSet8[ARTL_ART_statement] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS__STAR] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS__PLUS] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS_duplicate] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS__COMMA] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS__MINUS] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS__LT_MINUS] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS__MINUS_GT] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTS_changeColour] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTB_ID] = true;
    ARTSet26[ARTTB_INTEGER] = true;
    ARTSet26[ARTTS__LPAR] = true;
    ARTSet26[ARTL_ART_ID] = true;
    ARTSet26[ARTL_ART_INTEGER] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTS__COLON] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTB_ID] = true;
    ARTSet35[ARTTB_INTEGER] = true;
    ARTSet35[ARTTS__LPAR] = true;
    ARTSet35[ARTTS_cube] = true;
    ARTSet35[ARTTS_cuboid] = true;
    ARTSet35[ARTTS_cylinder] = true;
    ARTSet35[ARTTS_display] = true;
    ARTSet35[ARTTS_for] = true;
    ARTSet35[ARTTS_if] = true;
    ARTSet35[ARTTS_sphere] = true;
    ARTSet35[ARTTS_while] = true;
    ARTSet35[ARTL_ART_ID] = true;
    ARTSet35[ARTL_ART_INTEGER] = true;
    ARTSet35[ARTL_ART_expression] = true;
    ARTSet35[ARTL_ART_operand] = true;
    ARTSet35[ARTL_ART_statement] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS__LT] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS__BAR] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS__GT] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTS__GT_EQUAL] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTS__LT_EQUAL] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS_cylinder] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet6initialise();
    ARTSet15initialise();
    ARTSet38initialise();
    ARTSet27initialise();
    ARTSet28initialise();
    ARTSet45initialise();
    ARTSet44initialise();
    ARTSet9initialise();
    ARTSet37initialise();
    ARTSet16initialise();
    ARTSet3initialise();
    ARTSet41initialise();
    ARTSet30initialise();
    ARTSet20initialise();
    ARTSet2initialise();
    ARTSet33initialise();
    ARTSet36initialise();
    ARTSet42initialise();
    ARTSet48initialise();
    ARTSet5initialise();
    ARTSet19initialise();
    ARTSet40initialise();
    ARTSet29initialise();
    ARTSet7initialise();
    ARTSet17initialise();
    ARTSet18initialise();
    ARTSet8initialise();
    ARTSet25initialise();
    ARTSet24initialise();
    ARTSet46initialise();
    ARTSet21initialise();
    ARTSet23initialise();
    ARTSet31initialise();
    ARTSet43initialise();
    ARTSet47initialise();
    ARTSet26initialise();
    ARTSet34initialise();
    ARTSet35initialise();
    ARTSet32initialise();
    ARTSet11initialise();
    ARTSet14initialise();
    ARTSet39initialise();
    ARTSet4initialise();
    ARTSet10initialise();
    ARTSet12initialise();
    ARTSet13initialise();
    ARTSet22initialise();
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_342] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_342] = "";
    artlhsL[ARTL_ART_ID_342] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_342] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_342] = true;
    artLabelInternalStrings[ARTL_ART_ID_343] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_343] = "";
    artlhsL[ARTL_ART_ID_343] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_343] = true;
    artLabelInternalStrings[ARTL_ART_ID_344] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_344] = "";
    artlhsL[ARTL_ART_ID_344] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_344] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_344] = true;
    arteoR_pL[ARTL_ART_ID_344] = true;
    artPopD[ARTL_ART_ID_344] = true;
  }

  public void artTableInitialiser_ART_INTEGER() {
    artLabelInternalStrings[ARTL_ART_INTEGER] = "INTEGER";
    artLabelStrings[ARTL_ART_INTEGER] = "INTEGER";
    artKindOfs[ARTL_ART_INTEGER] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_INTEGER_348] = "INTEGER ::= . &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_348] = "";
    artlhsL[ARTL_ART_INTEGER_348] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_348] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_INTEGER_348] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_349] = "INTEGER ::= &INTEGER  ";
    artLabelStrings[ARTL_ART_INTEGER_349] = "";
    artlhsL[ARTL_ART_INTEGER_349] = ARTL_ART_INTEGER;
    artPopD[ARTL_ART_INTEGER_349] = true;
    artLabelInternalStrings[ARTL_ART_INTEGER_350] = "INTEGER ::= &INTEGER  .";
    artLabelStrings[ARTL_ART_INTEGER_350] = "";
    artlhsL[ARTL_ART_INTEGER_350] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_INTEGER_350] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_INTEGER_350] = true;
    arteoR_pL[ARTL_ART_INTEGER_350] = true;
    artPopD[ARTL_ART_INTEGER_350] = true;
  }

  public void artTableInitialiser_ART_condition() {
    artLabelInternalStrings[ARTL_ART_condition] = "condition";
    artLabelStrings[ARTL_ART_condition] = "condition";
    artKindOfs[ARTL_ART_condition] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_condition_168] = "condition ::= . expression ";
    artLabelStrings[ARTL_ART_condition_168] = "";
    artlhsL[ARTL_ART_condition_168] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_168] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_170] = "condition ::= expression .";
    artLabelStrings[ARTL_ART_condition_170] = "";
    artlhsL[ARTL_ART_condition_170] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_170] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_condition_170] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condition_170] = true;
    arteoR_pL[ARTL_ART_condition_170] = true;
    artPopD[ARTL_ART_condition_170] = true;
    artLabelInternalStrings[ARTL_ART_condition_174] = "condition ::= . condition '>'  expression ";
    artLabelStrings[ARTL_ART_condition_174] = "";
    artlhsL[ARTL_ART_condition_174] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_174] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_176] = "condition ::= condition . '>'  expression ";
    artLabelStrings[ARTL_ART_condition_176] = "";
    artlhsL[ARTL_ART_condition_176] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_176] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_176] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condition_176] = true;
    artLabelInternalStrings[ARTL_ART_condition_177] = "condition ::= condition '>'  expression ";
    artLabelStrings[ARTL_ART_condition_177] = "";
    artlhsL[ARTL_ART_condition_177] = ARTL_ART_condition;
    artLabelInternalStrings[ARTL_ART_condition_178] = "condition ::= condition '>'  . expression ";
    artLabelStrings[ARTL_ART_condition_178] = "";
    artlhsL[ARTL_ART_condition_178] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_178] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_180] = "condition ::= condition '>'  expression .";
    artLabelStrings[ARTL_ART_condition_180] = "";
    artlhsL[ARTL_ART_condition_180] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_180] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_condition_180] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condition_180] = true;
    arteoR_pL[ARTL_ART_condition_180] = true;
    artPopD[ARTL_ART_condition_180] = true;
    artLabelInternalStrings[ARTL_ART_condition_184] = "condition ::= . condition '<'  expression ";
    artLabelStrings[ARTL_ART_condition_184] = "";
    artlhsL[ARTL_ART_condition_184] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_184] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_186] = "condition ::= condition . '<'  expression ";
    artLabelStrings[ARTL_ART_condition_186] = "";
    artlhsL[ARTL_ART_condition_186] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_186] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_186] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condition_186] = true;
    artLabelInternalStrings[ARTL_ART_condition_187] = "condition ::= condition '<'  expression ";
    artLabelStrings[ARTL_ART_condition_187] = "";
    artlhsL[ARTL_ART_condition_187] = ARTL_ART_condition;
    artLabelInternalStrings[ARTL_ART_condition_188] = "condition ::= condition '<'  . expression ";
    artLabelStrings[ARTL_ART_condition_188] = "";
    artlhsL[ARTL_ART_condition_188] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_188] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_190] = "condition ::= condition '<'  expression .";
    artLabelStrings[ARTL_ART_condition_190] = "";
    artlhsL[ARTL_ART_condition_190] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_190] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_condition_190] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condition_190] = true;
    arteoR_pL[ARTL_ART_condition_190] = true;
    artPopD[ARTL_ART_condition_190] = true;
    artLabelInternalStrings[ARTL_ART_condition_194] = "condition ::= . condition '>='  expression ";
    artLabelStrings[ARTL_ART_condition_194] = "";
    artlhsL[ARTL_ART_condition_194] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_194] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_196] = "condition ::= condition . '>='  expression ";
    artLabelStrings[ARTL_ART_condition_196] = "";
    artlhsL[ARTL_ART_condition_196] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_196] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_196] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condition_196] = true;
    artLabelInternalStrings[ARTL_ART_condition_197] = "condition ::= condition '>='  expression ";
    artLabelStrings[ARTL_ART_condition_197] = "";
    artlhsL[ARTL_ART_condition_197] = ARTL_ART_condition;
    artLabelInternalStrings[ARTL_ART_condition_198] = "condition ::= condition '>='  . expression ";
    artLabelStrings[ARTL_ART_condition_198] = "";
    artlhsL[ARTL_ART_condition_198] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_198] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_200] = "condition ::= condition '>='  expression .";
    artLabelStrings[ARTL_ART_condition_200] = "";
    artlhsL[ARTL_ART_condition_200] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_200] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_condition_200] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condition_200] = true;
    arteoR_pL[ARTL_ART_condition_200] = true;
    artPopD[ARTL_ART_condition_200] = true;
    artLabelInternalStrings[ARTL_ART_condition_204] = "condition ::= . condition '<='  expression ";
    artLabelStrings[ARTL_ART_condition_204] = "";
    artlhsL[ARTL_ART_condition_204] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_204] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_206] = "condition ::= condition . '<='  expression ";
    artLabelStrings[ARTL_ART_condition_206] = "";
    artlhsL[ARTL_ART_condition_206] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_206] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_206] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condition_206] = true;
    artLabelInternalStrings[ARTL_ART_condition_207] = "condition ::= condition '<='  expression ";
    artLabelStrings[ARTL_ART_condition_207] = "";
    artlhsL[ARTL_ART_condition_207] = ARTL_ART_condition;
    artLabelInternalStrings[ARTL_ART_condition_208] = "condition ::= condition '<='  . expression ";
    artLabelStrings[ARTL_ART_condition_208] = "";
    artlhsL[ARTL_ART_condition_208] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_208] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_210] = "condition ::= condition '<='  expression .";
    artLabelStrings[ARTL_ART_condition_210] = "";
    artlhsL[ARTL_ART_condition_210] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_210] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_condition_210] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condition_210] = true;
    arteoR_pL[ARTL_ART_condition_210] = true;
    artPopD[ARTL_ART_condition_210] = true;
    artLabelInternalStrings[ARTL_ART_condition_214] = "condition ::= . condition '!='  expression ";
    artLabelStrings[ARTL_ART_condition_214] = "";
    artlhsL[ARTL_ART_condition_214] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_214] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_216] = "condition ::= condition . '!='  expression ";
    artLabelStrings[ARTL_ART_condition_216] = "";
    artlhsL[ARTL_ART_condition_216] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_216] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_216] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_condition_216] = true;
    artLabelInternalStrings[ARTL_ART_condition_217] = "condition ::= condition '!='  expression ";
    artLabelStrings[ARTL_ART_condition_217] = "";
    artlhsL[ARTL_ART_condition_217] = ARTL_ART_condition;
    artLabelInternalStrings[ARTL_ART_condition_218] = "condition ::= condition '!='  . expression ";
    artLabelStrings[ARTL_ART_condition_218] = "";
    artlhsL[ARTL_ART_condition_218] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_condition_218] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_condition_220] = "condition ::= condition '!='  expression .";
    artLabelStrings[ARTL_ART_condition_220] = "";
    artlhsL[ARTL_ART_condition_220] = ARTL_ART_condition;
    artSlotInstanceOfs[ARTL_ART_condition_220] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_condition_220] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_condition_220] = true;
    arteoR_pL[ARTL_ART_condition_220] = true;
    artPopD[ARTL_ART_condition_220] = true;
  }

  public void artTableInitialiser_ART_expression() {
    artLabelInternalStrings[ARTL_ART_expression] = "expression";
    artLabelStrings[ARTL_ART_expression] = "expression";
    artKindOfs[ARTL_ART_expression] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_expression_224] = "expression ::= . operand ";
    artLabelStrings[ARTL_ART_expression_224] = "";
    artlhsL[ARTL_ART_expression_224] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_224] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_226] = "expression ::= operand .";
    artLabelStrings[ARTL_ART_expression_226] = "";
    artlhsL[ARTL_ART_expression_226] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_226] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_expression_226] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_expression_226] = true;
    arteoR_pL[ARTL_ART_expression_226] = true;
    artPopD[ARTL_ART_expression_226] = true;
    artLabelInternalStrings[ARTL_ART_expression_230] = "expression ::= . 'sphere'  '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_230] = "";
    artlhsL[ARTL_ART_expression_230] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_230] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_231] = "expression ::= 'sphere'  '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_231] = "";
    artlhsL[ARTL_ART_expression_231] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_232] = "expression ::= 'sphere'  . '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_232] = "";
    artlhsL[ARTL_ART_expression_232] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_232] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_expression_232] = true;
    artLabelInternalStrings[ARTL_ART_expression_233] = "expression ::= 'sphere'  '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_233] = "";
    artlhsL[ARTL_ART_expression_233] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_234] = "expression ::= 'sphere'  '('  . expression ')'  ";
    artLabelStrings[ARTL_ART_expression_234] = "";
    artlhsL[ARTL_ART_expression_234] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_234] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_236] = "expression ::= 'sphere'  '('  expression . ')'  ";
    artLabelStrings[ARTL_ART_expression_236] = "";
    artlhsL[ARTL_ART_expression_236] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_236] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_236] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_expression_236] = true;
    artLabelInternalStrings[ARTL_ART_expression_237] = "expression ::= 'sphere'  '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_237] = "";
    artlhsL[ARTL_ART_expression_237] = ARTL_ART_expression;
    artPopD[ARTL_ART_expression_237] = true;
    artLabelInternalStrings[ARTL_ART_expression_238] = "expression ::= 'sphere'  '('  expression ')'  .";
    artLabelStrings[ARTL_ART_expression_238] = "";
    artlhsL[ARTL_ART_expression_238] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_238] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_expression_238] = true;
    arteoR_pL[ARTL_ART_expression_238] = true;
    artPopD[ARTL_ART_expression_238] = true;
    artLabelInternalStrings[ARTL_ART_expression_242] = "expression ::= . 'cube'  '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_242] = "";
    artlhsL[ARTL_ART_expression_242] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_242] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_243] = "expression ::= 'cube'  '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_243] = "";
    artlhsL[ARTL_ART_expression_243] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_244] = "expression ::= 'cube'  . '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_244] = "";
    artlhsL[ARTL_ART_expression_244] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_244] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_expression_244] = true;
    artLabelInternalStrings[ARTL_ART_expression_245] = "expression ::= 'cube'  '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_245] = "";
    artlhsL[ARTL_ART_expression_245] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_246] = "expression ::= 'cube'  '('  . expression ')'  ";
    artLabelStrings[ARTL_ART_expression_246] = "";
    artlhsL[ARTL_ART_expression_246] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_246] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_248] = "expression ::= 'cube'  '('  expression . ')'  ";
    artLabelStrings[ARTL_ART_expression_248] = "";
    artlhsL[ARTL_ART_expression_248] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_248] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_248] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_expression_248] = true;
    artLabelInternalStrings[ARTL_ART_expression_249] = "expression ::= 'cube'  '('  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_249] = "";
    artlhsL[ARTL_ART_expression_249] = ARTL_ART_expression;
    artPopD[ARTL_ART_expression_249] = true;
    artLabelInternalStrings[ARTL_ART_expression_250] = "expression ::= 'cube'  '('  expression ')'  .";
    artLabelStrings[ARTL_ART_expression_250] = "";
    artlhsL[ARTL_ART_expression_250] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_250] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_expression_250] = true;
    arteoR_pL[ARTL_ART_expression_250] = true;
    artPopD[ARTL_ART_expression_250] = true;
    artLabelInternalStrings[ARTL_ART_expression_254] = "expression ::= . 'cuboid'  '('  expression ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_254] = "";
    artlhsL[ARTL_ART_expression_254] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_254] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_255] = "expression ::= 'cuboid'  '('  expression ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_255] = "";
    artlhsL[ARTL_ART_expression_255] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_256] = "expression ::= 'cuboid'  . '('  expression ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_256] = "";
    artlhsL[ARTL_ART_expression_256] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_256] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_expression_256] = true;
    artLabelInternalStrings[ARTL_ART_expression_257] = "expression ::= 'cuboid'  '('  expression ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_257] = "";
    artlhsL[ARTL_ART_expression_257] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_258] = "expression ::= 'cuboid'  '('  . expression ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_258] = "";
    artlhsL[ARTL_ART_expression_258] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_258] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_260] = "expression ::= 'cuboid'  '('  expression . ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_260] = "";
    artlhsL[ARTL_ART_expression_260] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_260] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_260] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_261] = "expression ::= 'cuboid'  '('  expression ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_261] = "";
    artlhsL[ARTL_ART_expression_261] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_262] = "expression ::= 'cuboid'  '('  expression ','  . expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_262] = "";
    artlhsL[ARTL_ART_expression_262] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_262] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_264] = "expression ::= 'cuboid'  '('  expression ','  expression . ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_264] = "";
    artlhsL[ARTL_ART_expression_264] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_264] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_264] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_265] = "expression ::= 'cuboid'  '('  expression ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_265] = "";
    artlhsL[ARTL_ART_expression_265] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_266] = "expression ::= 'cuboid'  '('  expression ','  expression ','  . expression ')'  ";
    artLabelStrings[ARTL_ART_expression_266] = "";
    artlhsL[ARTL_ART_expression_266] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_266] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_268] = "expression ::= 'cuboid'  '('  expression ','  expression ','  expression . ')'  ";
    artLabelStrings[ARTL_ART_expression_268] = "";
    artlhsL[ARTL_ART_expression_268] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_268] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_268] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_expression_268] = true;
    artLabelInternalStrings[ARTL_ART_expression_269] = "expression ::= 'cuboid'  '('  expression ','  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_269] = "";
    artlhsL[ARTL_ART_expression_269] = ARTL_ART_expression;
    artPopD[ARTL_ART_expression_269] = true;
    artLabelInternalStrings[ARTL_ART_expression_270] = "expression ::= 'cuboid'  '('  expression ','  expression ','  expression ')'  .";
    artLabelStrings[ARTL_ART_expression_270] = "";
    artlhsL[ARTL_ART_expression_270] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_270] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_expression_270] = true;
    arteoR_pL[ARTL_ART_expression_270] = true;
    artPopD[ARTL_ART_expression_270] = true;
    artLabelInternalStrings[ARTL_ART_expression_274] = "expression ::= . 'cylinder'  '('  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_274] = "";
    artlhsL[ARTL_ART_expression_274] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_274] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_275] = "expression ::= 'cylinder'  '('  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_275] = "";
    artlhsL[ARTL_ART_expression_275] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_276] = "expression ::= 'cylinder'  . '('  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_276] = "";
    artlhsL[ARTL_ART_expression_276] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_276] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_expression_276] = true;
    artLabelInternalStrings[ARTL_ART_expression_277] = "expression ::= 'cylinder'  '('  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_277] = "";
    artlhsL[ARTL_ART_expression_277] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_278] = "expression ::= 'cylinder'  '('  . expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_278] = "";
    artlhsL[ARTL_ART_expression_278] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_278] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_280] = "expression ::= 'cylinder'  '('  expression . ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_280] = "";
    artlhsL[ARTL_ART_expression_280] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_280] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_280] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_281] = "expression ::= 'cylinder'  '('  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_281] = "";
    artlhsL[ARTL_ART_expression_281] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_282] = "expression ::= 'cylinder'  '('  expression ','  . expression ')'  ";
    artLabelStrings[ARTL_ART_expression_282] = "";
    artlhsL[ARTL_ART_expression_282] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_282] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_284] = "expression ::= 'cylinder'  '('  expression ','  expression . ')'  ";
    artLabelStrings[ARTL_ART_expression_284] = "";
    artlhsL[ARTL_ART_expression_284] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_284] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_284] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_expression_284] = true;
    artLabelInternalStrings[ARTL_ART_expression_285] = "expression ::= 'cylinder'  '('  expression ','  expression ')'  ";
    artLabelStrings[ARTL_ART_expression_285] = "";
    artlhsL[ARTL_ART_expression_285] = ARTL_ART_expression;
    artPopD[ARTL_ART_expression_285] = true;
    artLabelInternalStrings[ARTL_ART_expression_286] = "expression ::= 'cylinder'  '('  expression ','  expression ')'  .";
    artLabelStrings[ARTL_ART_expression_286] = "";
    artlhsL[ARTL_ART_expression_286] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_286] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_expression_286] = true;
    arteoR_pL[ARTL_ART_expression_286] = true;
    artPopD[ARTL_ART_expression_286] = true;
    artLabelInternalStrings[ARTL_ART_expression_290] = "expression ::= . expression '-'  operand ";
    artLabelStrings[ARTL_ART_expression_290] = "";
    artlhsL[ARTL_ART_expression_290] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_290] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_292] = "expression ::= expression . '-'  operand ";
    artLabelStrings[ARTL_ART_expression_292] = "";
    artlhsL[ARTL_ART_expression_292] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_292] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_292] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_expression_292] = true;
    artLabelInternalStrings[ARTL_ART_expression_293] = "expression ::= expression '-'  operand ";
    artLabelStrings[ARTL_ART_expression_293] = "";
    artlhsL[ARTL_ART_expression_293] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_294] = "expression ::= expression '-'  . operand ";
    artLabelStrings[ARTL_ART_expression_294] = "";
    artlhsL[ARTL_ART_expression_294] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_294] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_296] = "expression ::= expression '-'  operand .";
    artLabelStrings[ARTL_ART_expression_296] = "";
    artlhsL[ARTL_ART_expression_296] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_296] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_expression_296] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_expression_296] = true;
    arteoR_pL[ARTL_ART_expression_296] = true;
    artPopD[ARTL_ART_expression_296] = true;
    artLabelInternalStrings[ARTL_ART_expression_300] = "expression ::= . expression '+'  operand ";
    artLabelStrings[ARTL_ART_expression_300] = "";
    artlhsL[ARTL_ART_expression_300] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_300] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_302] = "expression ::= expression . '+'  operand ";
    artLabelStrings[ARTL_ART_expression_302] = "";
    artlhsL[ARTL_ART_expression_302] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_302] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_302] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_expression_302] = true;
    artLabelInternalStrings[ARTL_ART_expression_303] = "expression ::= expression '+'  operand ";
    artLabelStrings[ARTL_ART_expression_303] = "";
    artlhsL[ARTL_ART_expression_303] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_304] = "expression ::= expression '+'  . operand ";
    artLabelStrings[ARTL_ART_expression_304] = "";
    artlhsL[ARTL_ART_expression_304] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_304] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_306] = "expression ::= expression '+'  operand .";
    artLabelStrings[ARTL_ART_expression_306] = "";
    artlhsL[ARTL_ART_expression_306] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_306] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_expression_306] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_expression_306] = true;
    arteoR_pL[ARTL_ART_expression_306] = true;
    artPopD[ARTL_ART_expression_306] = true;
    artLabelInternalStrings[ARTL_ART_expression_310] = "expression ::= . expression '*'  operand ";
    artLabelStrings[ARTL_ART_expression_310] = "";
    artlhsL[ARTL_ART_expression_310] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_310] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_312] = "expression ::= expression . '*'  operand ";
    artLabelStrings[ARTL_ART_expression_312] = "";
    artlhsL[ARTL_ART_expression_312] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_312] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_312] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_expression_312] = true;
    artLabelInternalStrings[ARTL_ART_expression_313] = "expression ::= expression '*'  operand ";
    artLabelStrings[ARTL_ART_expression_313] = "";
    artlhsL[ARTL_ART_expression_313] = ARTL_ART_expression;
    artLabelInternalStrings[ARTL_ART_expression_314] = "expression ::= expression '*'  . operand ";
    artLabelStrings[ARTL_ART_expression_314] = "";
    artlhsL[ARTL_ART_expression_314] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_expression_314] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_expression_316] = "expression ::= expression '*'  operand .";
    artLabelStrings[ARTL_ART_expression_316] = "";
    artlhsL[ARTL_ART_expression_316] = ARTL_ART_expression;
    artSlotInstanceOfs[ARTL_ART_expression_316] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_expression_316] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_expression_316] = true;
    arteoR_pL[ARTL_ART_expression_316] = true;
    artPopD[ARTL_ART_expression_316] = true;
  }

  public void artTableInitialiser_ART_operand() {
    artLabelInternalStrings[ARTL_ART_operand] = "operand";
    artLabelStrings[ARTL_ART_operand] = "operand";
    artKindOfs[ARTL_ART_operand] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_operand_320] = "operand ::= . ID ";
    artLabelStrings[ARTL_ART_operand_320] = "";
    artlhsL[ARTL_ART_operand_320] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_320] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_322] = "operand ::= ID .";
    artLabelStrings[ARTL_ART_operand_322] = "";
    artlhsL[ARTL_ART_operand_322] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_322] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_operand_322] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_322] = true;
    arteoR_pL[ARTL_ART_operand_322] = true;
    artPopD[ARTL_ART_operand_322] = true;
    artLabelInternalStrings[ARTL_ART_operand_326] = "operand ::= . INTEGER ";
    artLabelStrings[ARTL_ART_operand_326] = "";
    artlhsL[ARTL_ART_operand_326] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_326] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_328] = "operand ::= INTEGER .";
    artLabelStrings[ARTL_ART_operand_328] = "";
    artlhsL[ARTL_ART_operand_328] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_328] = ARTL_ART_INTEGER;
    artKindOfs[ARTL_ART_operand_328] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_328] = true;
    arteoR_pL[ARTL_ART_operand_328] = true;
    artPopD[ARTL_ART_operand_328] = true;
    artLabelInternalStrings[ARTL_ART_operand_332] = "operand ::= . '('  expression ')'  ";
    artLabelStrings[ARTL_ART_operand_332] = "";
    artlhsL[ARTL_ART_operand_332] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_332] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_operand_333] = "operand ::= '('  expression ')'  ";
    artLabelStrings[ARTL_ART_operand_333] = "";
    artlhsL[ARTL_ART_operand_333] = ARTL_ART_operand;
    artLabelInternalStrings[ARTL_ART_operand_334] = "operand ::= '('  . expression ')'  ";
    artLabelStrings[ARTL_ART_operand_334] = "";
    artlhsL[ARTL_ART_operand_334] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_334] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_operand_334] = true;
    artLabelInternalStrings[ARTL_ART_operand_336] = "operand ::= '('  expression . ')'  ";
    artLabelStrings[ARTL_ART_operand_336] = "";
    artlhsL[ARTL_ART_operand_336] = ARTL_ART_operand;
    artSlotInstanceOfs[ARTL_ART_operand_336] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_operand_336] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_operand_336] = true;
    artLabelInternalStrings[ARTL_ART_operand_337] = "operand ::= '('  expression ')'  ";
    artLabelStrings[ARTL_ART_operand_337] = "";
    artlhsL[ARTL_ART_operand_337] = ARTL_ART_operand;
    artPopD[ARTL_ART_operand_337] = true;
    artLabelInternalStrings[ARTL_ART_operand_338] = "operand ::= '('  expression ')'  .";
    artLabelStrings[ARTL_ART_operand_338] = "";
    artlhsL[ARTL_ART_operand_338] = ARTL_ART_operand;
    artKindOfs[ARTL_ART_operand_338] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_operand_338] = true;
    arteoR_pL[ARTL_ART_operand_338] = true;
    artPopD[ARTL_ART_operand_338] = true;
  }

  public void artTableInitialiser_ART_statement() {
    artLabelInternalStrings[ARTL_ART_statement] = "statement";
    artLabelStrings[ARTL_ART_statement] = "statement";
    artKindOfs[ARTL_ART_statement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statement_12] = "statement ::= . ID '<-'  expression ';'  ";
    artLabelStrings[ARTL_ART_statement_12] = "";
    artlhsL[ARTL_ART_statement_12] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_12] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_14] = "statement ::= ID . '<-'  expression ';'  ";
    artLabelStrings[ARTL_ART_statement_14] = "";
    artlhsL[ARTL_ART_statement_14] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_14] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_statement_14] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_14] = true;
    artLabelInternalStrings[ARTL_ART_statement_15] = "statement ::= ID '<-'  expression ';'  ";
    artLabelStrings[ARTL_ART_statement_15] = "";
    artlhsL[ARTL_ART_statement_15] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_16] = "statement ::= ID '<-'  . expression ';'  ";
    artLabelStrings[ARTL_ART_statement_16] = "";
    artlhsL[ARTL_ART_statement_16] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_16] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_18] = "statement ::= ID '<-'  expression . ';'  ";
    artLabelStrings[ARTL_ART_statement_18] = "";
    artlhsL[ARTL_ART_statement_18] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_18] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_18] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_18] = true;
    artLabelInternalStrings[ARTL_ART_statement_19] = "statement ::= ID '<-'  expression ';'  ";
    artLabelStrings[ARTL_ART_statement_19] = "";
    artlhsL[ARTL_ART_statement_19] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_19] = true;
    artLabelInternalStrings[ARTL_ART_statement_20] = "statement ::= ID '<-'  expression ';'  .";
    artLabelStrings[ARTL_ART_statement_20] = "";
    artlhsL[ARTL_ART_statement_20] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_20] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_20] = true;
    arteoR_pL[ARTL_ART_statement_20] = true;
    artPopD[ARTL_ART_statement_20] = true;
    artLabelInternalStrings[ARTL_ART_statement_24] = "statement ::= . 'if'  condition ':'  statement 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_24] = "";
    artlhsL[ARTL_ART_statement_24] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_24] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_25] = "statement ::= 'if'  condition ':'  statement 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_25] = "";
    artlhsL[ARTL_ART_statement_25] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_26] = "statement ::= 'if'  . condition ':'  statement 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_26] = "";
    artlhsL[ARTL_ART_statement_26] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_26] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_26] = true;
    artLabelInternalStrings[ARTL_ART_statement_28] = "statement ::= 'if'  condition . ':'  statement 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_28] = "";
    artlhsL[ARTL_ART_statement_28] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_28] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_statement_28] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_29] = "statement ::= 'if'  condition ':'  statement 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_29] = "";
    artlhsL[ARTL_ART_statement_29] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_30] = "statement ::= 'if'  condition ':'  . statement 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_30] = "";
    artlhsL[ARTL_ART_statement_30] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_30] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_32] = "statement ::= 'if'  condition ':'  statement . 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_32] = "";
    artlhsL[ARTL_ART_statement_32] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_32] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_32] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_33] = "statement ::= 'if'  condition ':'  statement 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_33] = "";
    artlhsL[ARTL_ART_statement_33] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_34] = "statement ::= 'if'  condition ':'  statement 'else'  . ':'  statement ";
    artLabelStrings[ARTL_ART_statement_34] = "";
    artlhsL[ARTL_ART_statement_34] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_34] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_35] = "statement ::= 'if'  condition ':'  statement 'else'  ':'  statement ";
    artLabelStrings[ARTL_ART_statement_35] = "";
    artlhsL[ARTL_ART_statement_35] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_36] = "statement ::= 'if'  condition ':'  statement 'else'  ':'  . statement ";
    artLabelStrings[ARTL_ART_statement_36] = "";
    artlhsL[ARTL_ART_statement_36] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_36] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_38] = "statement ::= 'if'  condition ':'  statement 'else'  ':'  statement .";
    artLabelStrings[ARTL_ART_statement_38] = "";
    artlhsL[ARTL_ART_statement_38] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_38] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_38] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_38] = true;
    arteoR_pL[ARTL_ART_statement_38] = true;
    artPopD[ARTL_ART_statement_38] = true;
    artLabelInternalStrings[ARTL_ART_statement_42] = "statement ::= . 'while'  condition statement ";
    artLabelStrings[ARTL_ART_statement_42] = "";
    artlhsL[ARTL_ART_statement_42] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_42] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_43] = "statement ::= 'while'  condition statement ";
    artLabelStrings[ARTL_ART_statement_43] = "";
    artlhsL[ARTL_ART_statement_43] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_44] = "statement ::= 'while'  . condition statement ";
    artLabelStrings[ARTL_ART_statement_44] = "";
    artlhsL[ARTL_ART_statement_44] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_44] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_44] = true;
    artLabelInternalStrings[ARTL_ART_statement_46] = "statement ::= 'while'  condition . statement ";
    artLabelStrings[ARTL_ART_statement_46] = "";
    artlhsL[ARTL_ART_statement_46] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_46] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_statement_46] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_48] = "statement ::= 'while'  condition statement .";
    artLabelStrings[ARTL_ART_statement_48] = "";
    artlhsL[ARTL_ART_statement_48] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_48] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_48] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_48] = true;
    arteoR_pL[ARTL_ART_statement_48] = true;
    artPopD[ARTL_ART_statement_48] = true;
    artLabelInternalStrings[ARTL_ART_statement_52] = "statement ::= . 'for'  condition '|'  statement '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_52] = "";
    artlhsL[ARTL_ART_statement_52] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_52] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_53] = "statement ::= 'for'  condition '|'  statement '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_53] = "";
    artlhsL[ARTL_ART_statement_53] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_54] = "statement ::= 'for'  . condition '|'  statement '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_54] = "";
    artlhsL[ARTL_ART_statement_54] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_54] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_54] = true;
    artLabelInternalStrings[ARTL_ART_statement_56] = "statement ::= 'for'  condition . '|'  statement '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_56] = "";
    artlhsL[ARTL_ART_statement_56] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_56] = ARTL_ART_condition;
    artKindOfs[ARTL_ART_statement_56] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_57] = "statement ::= 'for'  condition '|'  statement '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_57] = "";
    artlhsL[ARTL_ART_statement_57] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_58] = "statement ::= 'for'  condition '|'  . statement '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_58] = "";
    artlhsL[ARTL_ART_statement_58] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_58] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_60] = "statement ::= 'for'  condition '|'  statement . '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_60] = "";
    artlhsL[ARTL_ART_statement_60] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_60] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_60] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_61] = "statement ::= 'for'  condition '|'  statement '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_61] = "";
    artlhsL[ARTL_ART_statement_61] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_62] = "statement ::= 'for'  condition '|'  statement '|'  . statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_62] = "";
    artlhsL[ARTL_ART_statement_62] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_62] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_64] = "statement ::= 'for'  condition '|'  statement '|'  statements . 'end'  ";
    artLabelStrings[ARTL_ART_statement_64] = "";
    artlhsL[ARTL_ART_statement_64] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_64] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statement_64] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_64] = true;
    artLabelInternalStrings[ARTL_ART_statement_65] = "statement ::= 'for'  condition '|'  statement '|'  statements 'end'  ";
    artLabelStrings[ARTL_ART_statement_65] = "";
    artlhsL[ARTL_ART_statement_65] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_65] = true;
    artLabelInternalStrings[ARTL_ART_statement_66] = "statement ::= 'for'  condition '|'  statement '|'  statements 'end'  .";
    artLabelStrings[ARTL_ART_statement_66] = "";
    artlhsL[ARTL_ART_statement_66] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_66] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_66] = true;
    arteoR_pL[ARTL_ART_statement_66] = true;
    artPopD[ARTL_ART_statement_66] = true;
    artLabelInternalStrings[ARTL_ART_statement_70] = "statement ::= . 'display'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_70] = "";
    artlhsL[ARTL_ART_statement_70] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_70] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_70] = true;
    artLabelInternalStrings[ARTL_ART_statement_71] = "statement ::= 'display'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_71] = "";
    artlhsL[ARTL_ART_statement_71] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_71] = true;
    artLabelInternalStrings[ARTL_ART_statement_72] = "statement ::= 'display'  . '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_72] = "";
    artlhsL[ARTL_ART_statement_72] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_72] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_72] = true;
    artPopD[ARTL_ART_statement_72] = true;
    artLabelInternalStrings[ARTL_ART_statement_73] = "statement ::= 'display'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_73] = "";
    artlhsL[ARTL_ART_statement_73] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_73] = true;
    artLabelInternalStrings[ARTL_ART_statement_74] = "statement ::= 'display'  '('  . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_74] = "";
    artlhsL[ARTL_ART_statement_74] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_74] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_74] = true;
    artLabelInternalStrings[ARTL_ART_statement_75] = "statement ::= 'display'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_75] = "";
    artlhsL[ARTL_ART_statement_75] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_75] = true;
    artLabelInternalStrings[ARTL_ART_statement_76] = "statement ::= 'display'  '('  ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_76] = "";
    artlhsL[ARTL_ART_statement_76] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_76] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_76] = true;
    artLabelInternalStrings[ARTL_ART_statement_77] = "statement ::= 'display'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_77] = "";
    artlhsL[ARTL_ART_statement_77] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_77] = true;
    artLabelInternalStrings[ARTL_ART_statement_78] = "statement ::= 'display'  '('  ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_78] = "";
    artlhsL[ARTL_ART_statement_78] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_78] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_78] = true;
    arteoR_pL[ARTL_ART_statement_78] = true;
    artPopD[ARTL_ART_statement_78] = true;
    artLabelInternalStrings[ARTL_ART_statement_82] = "statement ::= . expression '->'  'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_82] = "";
    artlhsL[ARTL_ART_statement_82] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_82] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_84] = "statement ::= expression . '->'  'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_84] = "";
    artlhsL[ARTL_ART_statement_84] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_84] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_84] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_84] = true;
    artLabelInternalStrings[ARTL_ART_statement_85] = "statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_85] = "";
    artlhsL[ARTL_ART_statement_85] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_86] = "statement ::= expression '->'  . 'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_86] = "";
    artlhsL[ARTL_ART_statement_86] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_86] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_87] = "statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_87] = "";
    artlhsL[ARTL_ART_statement_87] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_88] = "statement ::= expression '->'  'translate'  . '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_88] = "";
    artlhsL[ARTL_ART_statement_88] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_88] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_89] = "statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_89] = "";
    artlhsL[ARTL_ART_statement_89] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_90] = "statement ::= expression '->'  'translate'  '('  . expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_90] = "";
    artlhsL[ARTL_ART_statement_90] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_90] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_92] = "statement ::= expression '->'  'translate'  '('  expression . ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_92] = "";
    artlhsL[ARTL_ART_statement_92] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_92] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_92] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_93] = "statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_93] = "";
    artlhsL[ARTL_ART_statement_93] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_94] = "statement ::= expression '->'  'translate'  '('  expression ','  . expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_94] = "";
    artlhsL[ARTL_ART_statement_94] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_94] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_96] = "statement ::= expression '->'  'translate'  '('  expression ','  expression . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_96] = "";
    artlhsL[ARTL_ART_statement_96] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_96] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_96] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_96] = true;
    artLabelInternalStrings[ARTL_ART_statement_97] = "statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_97] = "";
    artlhsL[ARTL_ART_statement_97] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_97] = true;
    artLabelInternalStrings[ARTL_ART_statement_98] = "statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_98] = "";
    artlhsL[ARTL_ART_statement_98] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_98] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_98] = true;
    artLabelInternalStrings[ARTL_ART_statement_99] = "statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_99] = "";
    artlhsL[ARTL_ART_statement_99] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_99] = true;
    artLabelInternalStrings[ARTL_ART_statement_100] = "statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_100] = "";
    artlhsL[ARTL_ART_statement_100] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_100] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_100] = true;
    arteoR_pL[ARTL_ART_statement_100] = true;
    artPopD[ARTL_ART_statement_100] = true;
    artLabelInternalStrings[ARTL_ART_statement_104] = "statement ::= . expression '->'  'scale'  '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_104] = "";
    artlhsL[ARTL_ART_statement_104] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_104] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_106] = "statement ::= expression . '->'  'scale'  '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_106] = "";
    artlhsL[ARTL_ART_statement_106] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_106] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_106] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_106] = true;
    artLabelInternalStrings[ARTL_ART_statement_107] = "statement ::= expression '->'  'scale'  '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_107] = "";
    artlhsL[ARTL_ART_statement_107] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_108] = "statement ::= expression '->'  . 'scale'  '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_108] = "";
    artlhsL[ARTL_ART_statement_108] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_108] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_109] = "statement ::= expression '->'  'scale'  '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_109] = "";
    artlhsL[ARTL_ART_statement_109] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_110] = "statement ::= expression '->'  'scale'  . '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_110] = "";
    artlhsL[ARTL_ART_statement_110] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_110] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_111] = "statement ::= expression '->'  'scale'  '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_111] = "";
    artlhsL[ARTL_ART_statement_111] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_112] = "statement ::= expression '->'  'scale'  '('  . expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_112] = "";
    artlhsL[ARTL_ART_statement_112] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_112] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_114] = "statement ::= expression '->'  'scale'  '('  expression . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_114] = "";
    artlhsL[ARTL_ART_statement_114] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_114] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_114] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_114] = true;
    artLabelInternalStrings[ARTL_ART_statement_115] = "statement ::= expression '->'  'scale'  '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_115] = "";
    artlhsL[ARTL_ART_statement_115] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_115] = true;
    artLabelInternalStrings[ARTL_ART_statement_116] = "statement ::= expression '->'  'scale'  '('  expression ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_116] = "";
    artlhsL[ARTL_ART_statement_116] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_116] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_116] = true;
    artLabelInternalStrings[ARTL_ART_statement_117] = "statement ::= expression '->'  'scale'  '('  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_117] = "";
    artlhsL[ARTL_ART_statement_117] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_117] = true;
    artLabelInternalStrings[ARTL_ART_statement_118] = "statement ::= expression '->'  'scale'  '('  expression ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_118] = "";
    artlhsL[ARTL_ART_statement_118] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_118] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_118] = true;
    arteoR_pL[ARTL_ART_statement_118] = true;
    artPopD[ARTL_ART_statement_118] = true;
    artLabelInternalStrings[ARTL_ART_statement_122] = "statement ::= . expression '->'  'duplicate'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_122] = "";
    artlhsL[ARTL_ART_statement_122] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_122] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_124] = "statement ::= expression . '->'  'duplicate'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_124] = "";
    artlhsL[ARTL_ART_statement_124] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_124] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_124] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_124] = true;
    artPopD[ARTL_ART_statement_124] = true;
    artLabelInternalStrings[ARTL_ART_statement_125] = "statement ::= expression '->'  'duplicate'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_125] = "";
    artlhsL[ARTL_ART_statement_125] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_125] = true;
    artLabelInternalStrings[ARTL_ART_statement_126] = "statement ::= expression '->'  . 'duplicate'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_126] = "";
    artlhsL[ARTL_ART_statement_126] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_126] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_126] = true;
    artLabelInternalStrings[ARTL_ART_statement_127] = "statement ::= expression '->'  'duplicate'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_127] = "";
    artlhsL[ARTL_ART_statement_127] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_127] = true;
    artLabelInternalStrings[ARTL_ART_statement_128] = "statement ::= expression '->'  'duplicate'  . '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_128] = "";
    artlhsL[ARTL_ART_statement_128] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_128] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_128] = true;
    artLabelInternalStrings[ARTL_ART_statement_129] = "statement ::= expression '->'  'duplicate'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_129] = "";
    artlhsL[ARTL_ART_statement_129] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_129] = true;
    artLabelInternalStrings[ARTL_ART_statement_130] = "statement ::= expression '->'  'duplicate'  '('  . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_130] = "";
    artlhsL[ARTL_ART_statement_130] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_130] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_130] = true;
    artLabelInternalStrings[ARTL_ART_statement_131] = "statement ::= expression '->'  'duplicate'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_131] = "";
    artlhsL[ARTL_ART_statement_131] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_131] = true;
    artLabelInternalStrings[ARTL_ART_statement_132] = "statement ::= expression '->'  'duplicate'  '('  ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_132] = "";
    artlhsL[ARTL_ART_statement_132] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_132] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_132] = true;
    artLabelInternalStrings[ARTL_ART_statement_133] = "statement ::= expression '->'  'duplicate'  '('  ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_133] = "";
    artlhsL[ARTL_ART_statement_133] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_133] = true;
    artLabelInternalStrings[ARTL_ART_statement_134] = "statement ::= expression '->'  'duplicate'  '('  ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_134] = "";
    artlhsL[ARTL_ART_statement_134] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_134] = true;
    arteoR_pL[ARTL_ART_statement_134] = true;
    artPopD[ARTL_ART_statement_134] = true;
    artLabelInternalStrings[ARTL_ART_statement_138] = "statement ::= . expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_138] = "";
    artlhsL[ARTL_ART_statement_138] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_138] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_140] = "statement ::= expression . '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_140] = "";
    artlhsL[ARTL_ART_statement_140] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_140] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_140] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statement_140] = true;
    artLabelInternalStrings[ARTL_ART_statement_141] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_141] = "";
    artlhsL[ARTL_ART_statement_141] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_142] = "statement ::= expression '->'  . 'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_142] = "";
    artlhsL[ARTL_ART_statement_142] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_142] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_143] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_143] = "";
    artlhsL[ARTL_ART_statement_143] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_144] = "statement ::= expression '->'  'changeColour'  . '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_144] = "";
    artlhsL[ARTL_ART_statement_144] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_144] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_145] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_145] = "";
    artlhsL[ARTL_ART_statement_145] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_146] = "statement ::= expression '->'  'changeColour'  '('  . expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_146] = "";
    artlhsL[ARTL_ART_statement_146] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_146] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_148] = "statement ::= expression '->'  'changeColour'  '('  expression . ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_148] = "";
    artlhsL[ARTL_ART_statement_148] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_148] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_148] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_149] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_149] = "";
    artlhsL[ARTL_ART_statement_149] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_150] = "statement ::= expression '->'  'changeColour'  '('  expression ','  . expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_150] = "";
    artlhsL[ARTL_ART_statement_150] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_150] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_152] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression . ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_152] = "";
    artlhsL[ARTL_ART_statement_152] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_152] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_152] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_153] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_153] = "";
    artlhsL[ARTL_ART_statement_153] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_154] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  . expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_154] = "";
    artlhsL[ARTL_ART_statement_154] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_154] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_156] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression . ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_156] = "";
    artlhsL[ARTL_ART_statement_156] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_156] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_156] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_157] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_157] = "";
    artlhsL[ARTL_ART_statement_157] = ARTL_ART_statement;
    artLabelInternalStrings[ARTL_ART_statement_158] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  . expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_158] = "";
    artlhsL[ARTL_ART_statement_158] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_158] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statement_160] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression . ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_160] = "";
    artlhsL[ARTL_ART_statement_160] = ARTL_ART_statement;
    artSlotInstanceOfs[ARTL_ART_statement_160] = ARTL_ART_expression;
    artKindOfs[ARTL_ART_statement_160] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_160] = true;
    artLabelInternalStrings[ARTL_ART_statement_161] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_161] = "";
    artlhsL[ARTL_ART_statement_161] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_161] = true;
    artLabelInternalStrings[ARTL_ART_statement_162] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  . ';'  ";
    artLabelStrings[ARTL_ART_statement_162] = "";
    artlhsL[ARTL_ART_statement_162] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_162] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_statement_162] = true;
    artLabelInternalStrings[ARTL_ART_statement_163] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  ";
    artLabelStrings[ARTL_ART_statement_163] = "";
    artlhsL[ARTL_ART_statement_163] = ARTL_ART_statement;
    artPopD[ARTL_ART_statement_163] = true;
    artLabelInternalStrings[ARTL_ART_statement_164] = "statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  .";
    artLabelStrings[ARTL_ART_statement_164] = "";
    artlhsL[ARTL_ART_statement_164] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statement_164] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statement_164] = true;
    arteoR_pL[ARTL_ART_statement_164] = true;
    artPopD[ARTL_ART_statement_164] = true;
  }

  public void artTableInitialiser_ART_statements() {
    artLabelInternalStrings[ARTL_ART_statements] = "statements";
    artLabelStrings[ARTL_ART_statements] = "statements";
    artKindOfs[ARTL_ART_statements] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_statements_2] = "statements ::= . statement ";
    artLabelStrings[ARTL_ART_statements_2] = "";
    artlhsL[ARTL_ART_statements_2] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_4] = "statements ::= statement .";
    artLabelStrings[ARTL_ART_statements_4] = "";
    artlhsL[ARTL_ART_statements_4] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_4] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statements_4] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_4] = true;
    arteoR_pL[ARTL_ART_statements_4] = true;
    artPopD[ARTL_ART_statements_4] = true;
    artLabelInternalStrings[ARTL_ART_statements_6] = "statements ::= . statement statements ";
    artLabelStrings[ARTL_ART_statements_6] = "";
    artlhsL[ARTL_ART_statements_6] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_6] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_statements_8] = "statements ::= statement . statements ";
    artLabelStrings[ARTL_ART_statements_8] = "";
    artlhsL[ARTL_ART_statements_8] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_8] = ARTL_ART_statement;
    artKindOfs[ARTL_ART_statements_8] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_statements_8] = true;
    artLabelInternalStrings[ARTL_ART_statements_10] = "statements ::= statement statements .";
    artLabelStrings[ARTL_ART_statements_10] = "";
    artlhsL[ARTL_ART_statements_10] = ARTL_ART_statements;
    artSlotInstanceOfs[ARTL_ART_statements_10] = ARTL_ART_statements;
    artKindOfs[ARTL_ART_statements_10] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_statements_10] = true;
    arteoR_pL[ARTL_ART_statements_10] = true;
    artPopD[ARTL_ART_statements_10] = true;
  }

  public void artTableInitialise() {
    artLabelInternalStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelInternalStrings[ARTL_EOS] = "ART$";
    artLabelStrings[ARTL_EOS] = " EOS $";
    artLabelInternalStrings[ARTX_DESPATCH] = "ARTX_DESPATCH";
    artLabelStrings[ARTX_DESPATCH] = " DESPATCH";
    artLabelInternalStrings[ARTL_DUMMY] = "ARTL_DUMMY";
    artLabelStrings[ARTL_DUMMY] = " DUMMY";
    artLabelInternalStrings[ARTX_LABEL_EXTENT] = "!!ILLEGAL!!";
    artLabelStrings[ARTX_LABEL_EXTENT] = " ILLEGAL";
    artLabelStrings[ARTL_EPSILON] = "#";
    artLabelInternalStrings[ARTL_EPSILON] = "#";

    artTerminalRequiresWhiteSpace = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalRequiresWhiteSpace, 0, ARTL_EPSILON, false);

    artTerminalCaseInsensitive = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalCaseInsensitive, 0, ARTL_EPSILON, false);

    artlhsL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artlhsL, 0, ARTX_LABEL_EXTENT);
    artlhsL[ARTX_DESPATCH] = ARTX_DESPATCH;

    artKindOfs = new int[ARTX_LABEL_EXTENT + 1];
    artKindOfs[ARTL_EOS] = ARTK_EOS;
    artKindOfs[ARTL_EPSILON] = ARTK_EPSILON;

    artHigher = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artLonger = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artShorter = new ARTBitSet[ARTX_LABEL_EXTENT + 1];

    artPreSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPreSlots, 0, ARTX_LABEL_EXTENT);

    artPostSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPostSlots, 0, ARTX_LABEL_EXTENT);

    artInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artSlotInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artSlotInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artUserNameOfs = new int[ARTX_LABEL_EXTENT + 1];

    artGathers = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artGathers, 0, ARTX_LABEL_EXTENT);

    artFolds = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artFolds, 0, ARTX_LABEL_EXTENT, 0);

    artpL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artpL, 0, ARTX_LABEL_EXTENT);

    artaL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artaL, 0, ARTX_LABEL_EXTENT);

    artcolonL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artcolonL, 0, ARTX_LABEL_EXTENT);

    arteoOPL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoOPL, 0, ARTX_LABEL_EXTENT, false);

    artfiRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiRL, 0, ARTX_LABEL_EXTENT, false);

    artfiPCL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiPCL, 0, ARTX_LABEL_EXTENT, false);

    arteoRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoRL, 0, ARTX_LABEL_EXTENT, false);

    arteoR_pL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoR_pL, 0, ARTX_LABEL_EXTENT, false);

    artPopD = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artPopD, 0, ARTX_LABEL_EXTENT, false);

    artLabelStrings[ARTTB_ID] = "ID";
    artLabelInternalStrings[ARTTB_ID] = "&ID";
    artKindOfs[ARTTB_ID] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_ID] = true;
    artLabelStrings[ARTTB_INTEGER] = "INTEGER";
    artLabelInternalStrings[ARTTB_INTEGER] = "&INTEGER";
    artKindOfs[ARTTB_INTEGER] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_INTEGER] = true;
    artLabelStrings[ARTTB_SIMPLE_WHITESPACE] = "SIMPLE_WHITESPACE";
    artLabelInternalStrings[ARTTB_SIMPLE_WHITESPACE] = "&SIMPLE_WHITESPACE";
    artKindOfs[ARTTB_SIMPLE_WHITESPACE] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_SIMPLE_WHITESPACE] = true;
    artLabelStrings[ARTTS__SHREIK_EQUAL] = "!=";
    artLabelInternalStrings[ARTTS__SHREIK_EQUAL] = "'!='";
    artKindOfs[ARTTS__SHREIK_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK_EQUAL] = true;
    artLabelStrings[ARTTS__LPAR] = "(";
    artLabelInternalStrings[ARTTS__LPAR] = "'('";
    artKindOfs[ARTTS__LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LPAR] = true;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__STAR] = "*";
    artLabelInternalStrings[ARTTS__STAR] = "'*'";
    artKindOfs[ARTTS__STAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__STAR] = true;
    artLabelStrings[ARTTS__PLUS] = "+";
    artLabelInternalStrings[ARTTS__PLUS] = "'+'";
    artKindOfs[ARTTS__PLUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__PLUS] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS] = "-";
    artLabelInternalStrings[ARTTS__MINUS] = "'-'";
    artKindOfs[ARTTS__MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS] = true;
    artLabelStrings[ARTTS__MINUS_GT] = "->";
    artLabelInternalStrings[ARTTS__MINUS_GT] = "'->'";
    artKindOfs[ARTTS__MINUS_GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS_GT] = true;
    artLabelStrings[ARTTS__COLON] = ":";
    artLabelInternalStrings[ARTTS__COLON] = "':'";
    artKindOfs[ARTTS__COLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COLON] = true;
    artLabelStrings[ARTTS__SEMICOLON] = ";";
    artLabelInternalStrings[ARTTS__SEMICOLON] = "';'";
    artKindOfs[ARTTS__SEMICOLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SEMICOLON] = true;
    artLabelStrings[ARTTS__LT] = "<";
    artLabelInternalStrings[ARTTS__LT] = "'<'";
    artKindOfs[ARTTS__LT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT] = true;
    artLabelStrings[ARTTS__LT_MINUS] = "<-";
    artLabelInternalStrings[ARTTS__LT_MINUS] = "'<-'";
    artKindOfs[ARTTS__LT_MINUS] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT_MINUS] = true;
    artLabelStrings[ARTTS__LT_EQUAL] = "<=";
    artLabelInternalStrings[ARTTS__LT_EQUAL] = "'<='";
    artKindOfs[ARTTS__LT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT_EQUAL] = true;
    artLabelStrings[ARTTS__GT] = ">";
    artLabelInternalStrings[ARTTS__GT] = "'>'";
    artKindOfs[ARTTS__GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT] = true;
    artLabelStrings[ARTTS__GT_EQUAL] = ">=";
    artLabelInternalStrings[ARTTS__GT_EQUAL] = "'>='";
    artKindOfs[ARTTS__GT_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT_EQUAL] = true;
    artLabelStrings[ARTTS_changeColour] = "changeColour";
    artLabelInternalStrings[ARTTS_changeColour] = "'changeColour'";
    artKindOfs[ARTTS_changeColour] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_changeColour] = true;
    artLabelStrings[ARTTS_cube] = "cube";
    artLabelInternalStrings[ARTTS_cube] = "'cube'";
    artKindOfs[ARTTS_cube] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_cube] = true;
    artLabelStrings[ARTTS_cuboid] = "cuboid";
    artLabelInternalStrings[ARTTS_cuboid] = "'cuboid'";
    artKindOfs[ARTTS_cuboid] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_cuboid] = true;
    artLabelStrings[ARTTS_cylinder] = "cylinder";
    artLabelInternalStrings[ARTTS_cylinder] = "'cylinder'";
    artKindOfs[ARTTS_cylinder] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_cylinder] = true;
    artLabelStrings[ARTTS_display] = "display";
    artLabelInternalStrings[ARTTS_display] = "'display'";
    artKindOfs[ARTTS_display] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_display] = true;
    artLabelStrings[ARTTS_duplicate] = "duplicate";
    artLabelInternalStrings[ARTTS_duplicate] = "'duplicate'";
    artKindOfs[ARTTS_duplicate] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_duplicate] = true;
    artLabelStrings[ARTTS_else] = "else";
    artLabelInternalStrings[ARTTS_else] = "'else'";
    artKindOfs[ARTTS_else] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_else] = true;
    artLabelStrings[ARTTS_end] = "end";
    artLabelInternalStrings[ARTTS_end] = "'end'";
    artKindOfs[ARTTS_end] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_end] = true;
    artLabelStrings[ARTTS_for] = "for";
    artLabelInternalStrings[ARTTS_for] = "'for'";
    artKindOfs[ARTTS_for] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_for] = true;
    artLabelStrings[ARTTS_if] = "if";
    artLabelInternalStrings[ARTTS_if] = "'if'";
    artKindOfs[ARTTS_if] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_if] = true;
    artLabelStrings[ARTTS_scale] = "scale";
    artLabelInternalStrings[ARTTS_scale] = "'scale'";
    artKindOfs[ARTTS_scale] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_scale] = true;
    artLabelStrings[ARTTS_sphere] = "sphere";
    artLabelInternalStrings[ARTTS_sphere] = "'sphere'";
    artKindOfs[ARTTS_sphere] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_sphere] = true;
    artLabelStrings[ARTTS_translate] = "translate";
    artLabelInternalStrings[ARTTS_translate] = "'translate'";
    artKindOfs[ARTTS_translate] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_translate] = true;
    artLabelStrings[ARTTS_while] = "while";
    artLabelInternalStrings[ARTTS_while] = "'while'";
    artKindOfs[ARTTS_while] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_while] = true;
    artLabelStrings[ARTTS__BAR] = "|";
    artLabelInternalStrings[ARTTS__BAR] = "'|'";
    artKindOfs[ARTTS__BAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__BAR] = true;
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_INTEGER();
    artTableInitialiser_ART_condition();
    artTableInitialiser_ART_expression();
    artTableInitialiser_ART_operand();
    artTableInitialiser_ART_statement();
    artTableInitialiser_ART_statements();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__SHREIK_EQUAL;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 42;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_statements;
    artBuildDirectives = "ARTDirectives [verbosityLevel=0, statistics=false, trace=false, inputs=[], inputFilenames=[], lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;

  ITerms iTerms = new ITermsLowLevelAPI();
  Value variables = new __map();

  public static class ARTAT_ART_ID extends ARTGLLAttributeBlock {
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public __string v;
    public String toString() {
      String ret = "";
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_INTEGER extends ARTGLLAttributeBlock {
    public __int32 v;
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public static class ARTAT_ART_condition extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle condition1;
    ARTGLLRDTHandle expression1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_expression extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle expression1;
    ARTGLLRDTHandle expression2;
    ARTGLLRDTHandle expression3;
    ARTGLLRDTHandle operand1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_operand extends ARTGLLAttributeBlock {
    public Value v;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle INTEGER1;
    ARTGLLRDTHandle expression1;
    public String toString() {
      String ret = "";
    ret += " v=" + v;
      return ret + " ";
}
  }

  public static class ARTAT_ART_statement extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle condition1;
    ARTGLLRDTHandle expression1;
    ARTGLLRDTHandle expression2;
    ARTGLLRDTHandle expression3;
    ARTGLLRDTHandle expression4;
    ARTGLLRDTHandle expression5;
    ARTGLLRDTHandle statement1;
    ARTGLLRDTHandle statement2;
    ARTGLLRDTHandle statements1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public static class ARTAT_ART_statements extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle statement1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*ID ::= &ID  .*/
      case ARTL_ART_ID_344: 
                ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID);
        artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
        ID.lexeme = artLexeme(ID.leftExtent, ID.rightExtent); ID.v = new __string(artLexemeAsID(ID.leftExtent, ID.rightExtent)); 
        break;
        default:
          throw new ARTException("ARTRD_ID: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_INTEGER(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_INTEGER INTEGER) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*INTEGER ::= &INTEGER  .*/
    case ARTL_ART_INTEGER_350: 
            ARTRD_INTEGER(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, INTEGER);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      INTEGER.lexeme = artLexeme(INTEGER.leftExtent, INTEGER.rightExtent); INTEGER.v = new __int32(artLexemeAsInteger(INTEGER.leftExtent, INTEGER.rightExtent), 0); 
      break;
        default:
          throw new ARTException("ARTRD_INTEGER: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_condition(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_condition condition, ARTAT_ART_condition condition1, ARTAT_ART_expression expression1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*condition ::= expression .*/
    case ARTL_ART_condition_170: 
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
            ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condition, condition1, expression1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
       condition.v = expression1.v; 
      break;
    /*condition ::= condition '>'  . expression */
    case ARTL_ART_condition_178: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), condition1));
      ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, condition1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*condition ::= condition '>'  expression .*/
    case ARTL_ART_condition_180: 
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
            ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condition, condition1, expression1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
       condition.v = condition1.v.__gt(expression1.v); 
      break;
    /*condition ::= condition '<'  . expression */
    case ARTL_ART_condition_188: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), condition1));
      ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, condition1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*condition ::= condition '<'  expression .*/
    case ARTL_ART_condition_190: 
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
            ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condition, condition1, expression1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
       condition.v = condition1.v.__lt(expression1.v); 
      break;
    /*condition ::= condition '>='  . expression */
    case ARTL_ART_condition_198: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), condition1));
      ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, condition1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*condition ::= condition '>='  expression .*/
    case ARTL_ART_condition_200: 
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
            ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condition, condition1, expression1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
       condition.v = condition1.v.__ge(expression1.v); 
      break;
    /*condition ::= condition '<='  . expression */
    case ARTL_ART_condition_208: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), condition1));
      ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, condition1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*condition ::= condition '<='  expression .*/
    case ARTL_ART_condition_210: 
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
            ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condition, condition1, expression1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
       condition.v = condition1.v.__le(expression1.v); 
      break;
    /*condition ::= condition '!='  . expression */
    case ARTL_ART_condition_218: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), condition1));
      ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, condition1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*condition ::= condition '!='  expression .*/
    case ARTL_ART_condition_220: 
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
            ARTRD_condition(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, condition, condition1, expression1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
       condition.v = condition1.v.__ne(expression1.v); 
      break;
        default:
          throw new ARTException("ARTRD_condition: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_expression(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_expression expression, ARTAT_ART_expression expression1, ARTAT_ART_expression expression2, ARTAT_ART_expression expression3, ARTAT_ART_operand operand1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*expression ::= operand .*/
    case ARTL_ART_expression_226: 
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      operand1 = new ARTAT_ART_operand();
            ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       expression.v = operand1.v; 
      break;
    /*expression ::= 'sphere'  '('  . expression ')'  */
    case ARTL_ART_expression_234: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= 'sphere'  '('  expression . ')'  */
    case ARTL_ART_expression_236: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            break;
    /*expression ::= 'sphere'  '('  expression ')'  .*/
    case ARTL_ART_expression_238: 
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      operand1 = new ARTAT_ART_operand();
            ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       expression.v = iTerms.valueUserPlugin.user(new __int32(1,0), expression1.v);
      break;
    /*expression ::= 'cube'  '('  . expression ')'  */
    case ARTL_ART_expression_246: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= 'cube'  '('  expression . ')'  */
    case ARTL_ART_expression_248: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            break;
    /*expression ::= 'cube'  '('  expression ')'  .*/
    case ARTL_ART_expression_250: 
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      operand1 = new ARTAT_ART_operand();
            ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       expression.v = iTerms.valueUserPlugin.user(new __int32(2,0), expression1.v, expression1.v, expression1.v);
      break;
    /*expression ::= 'cuboid'  '('  . expression ','  expression ','  expression ')'  */
    case ARTL_ART_expression_258: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= 'cuboid'  '('  expression . ','  expression ','  expression ')'  */
    case ARTL_ART_expression_260: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            break;
    /*expression ::= 'cuboid'  '('  expression ','  . expression ','  expression ')'  */
    case ARTL_ART_expression_262: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= 'cuboid'  '('  expression ','  expression . ','  expression ')'  */
    case ARTL_ART_expression_264: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression2));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression2, null, null, null, null);
            break;
    /*expression ::= 'cuboid'  '('  expression ','  expression ','  . expression ')'  */
    case ARTL_ART_expression_266: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= 'cuboid'  '('  expression ','  expression ','  expression . ')'  */
    case ARTL_ART_expression_268: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression3));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression3, null, null, null, null);
            break;
    /*expression ::= 'cuboid'  '('  expression ','  expression ','  expression ')'  .*/
    case ARTL_ART_expression_270: 
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      operand1 = new ARTAT_ART_operand();
            ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       expression.v = iTerms.valueUserPlugin.user(new __int32(2,0), expression1.v, expression2.v, expression3.v);
      break;
    /*expression ::= 'cylinder'  '('  . expression ','  expression ')'  */
    case ARTL_ART_expression_278: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= 'cylinder'  '('  expression . ','  expression ')'  */
    case ARTL_ART_expression_280: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            break;
    /*expression ::= 'cylinder'  '('  expression ','  . expression ')'  */
    case ARTL_ART_expression_282: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= 'cylinder'  '('  expression ','  expression . ')'  */
    case ARTL_ART_expression_284: 
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression2));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression2, null, null, null, null);
            break;
    /*expression ::= 'cylinder'  '('  expression ','  expression ')'  .*/
    case ARTL_ART_expression_286: 
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      operand1 = new ARTAT_ART_operand();
            ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       expression.v = iTerms.valueUserPlugin.user(new __int32(3,0), expression1.v, expression2.v);
      break;
    /*expression ::= expression '-'  . operand */
    case ARTL_ART_expression_294: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= expression '-'  operand .*/
    case ARTL_ART_expression_296: 
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      operand1 = new ARTAT_ART_operand();
            ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       expression.v = expression1.v.__sub(operand1.v); 
      break;
    /*expression ::= expression '+'  . operand */
    case ARTL_ART_expression_304: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= expression '+'  operand .*/
    case ARTL_ART_expression_306: 
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      operand1 = new ARTAT_ART_operand();
            ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       expression.v = expression1.v.__add(operand1.v); 
      break;
    /*expression ::= expression '*'  . operand */
    case ARTL_ART_expression_314: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*expression ::= expression '*'  operand .*/
    case ARTL_ART_expression_316: 
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      operand1 = new ARTAT_ART_operand();
            ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, expression, expression1, expression2, expression3, operand1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), operand1));
      ARTRD_operand(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, operand1, null, null, null);
       expression.v = expression1.v.__mul(operand1.v); 
      break;
        default:
          throw new ARTException("ARTRD_expression: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_operand(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_operand operand, ARTAT_ART_ID ID1, ARTAT_ART_INTEGER INTEGER1, ARTAT_ART_expression expression1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*operand ::= ID .*/
    case ARTL_ART_operand_322: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      expression1 = new ARTAT_ART_expression();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, ID1, INTEGER1, expression1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      operand.v = variables.__get(ID1.v); 
      break;
    /*operand ::= INTEGER .*/
    case ARTL_ART_operand_328: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      expression1 = new ARTAT_ART_expression();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, ID1, INTEGER1, expression1);
      INTEGER1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      INTEGER1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), INTEGER1));
      ARTRD_INTEGER(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, INTEGER1);
      operand.v = INTEGER1.v; 
      break;
    /*operand ::= '('  expression . ')'  */
    case ARTL_ART_operand_336: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            break;
    /*operand ::= '('  expression ')'  .*/
    case ARTL_ART_operand_338: 
      ID1 = new ARTAT_ART_ID();
      INTEGER1 = new ARTAT_ART_INTEGER();
      expression1 = new ARTAT_ART_expression();
            ARTRD_operand(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, operand, ID1, INTEGER1, expression1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      operand.v = expression1.v; 
      break;
        default:
          throw new ARTException("ARTRD_operand: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_statement statement, ARTAT_ART_ID ID1, ARTAT_ART_condition condition1, ARTAT_ART_expression expression1, ARTAT_ART_expression expression2, ARTAT_ART_expression expression3, ARTAT_ART_expression expression4, ARTAT_ART_expression expression5, ARTAT_ART_statement statement1, ARTAT_ART_statement statement2, ARTAT_ART_statements statements1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statement ::= ID '<-'  . expression ';'  */
    case ARTL_ART_statement_16: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= ID '<-'  expression . ';'  */
    case ARTL_ART_statement_18: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            break;
    /*statement ::= ID '<-'  expression ';'  .*/
    case ARTL_ART_statement_20: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       variables.__put(ID1.v, expression1.v); 
      break;
    /*statement ::= 'if'  condition . ':'  statement 'else'  ':'  statement */
    case ARTL_ART_statement_28: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), condition1));
      ARTRD_condition(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, condition1, null, null);
            break;
    /*statement ::= 'if'  condition ':'  . statement 'else'  ':'  statement */
    case ARTL_ART_statement_30: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'if'  condition ':'  statement . 'else'  ':'  statement */
    case ARTL_ART_statement_32: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'if'  condition ':'  statement 'else'  . ':'  statement */
    case ARTL_ART_statement_34: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'if'  condition ':'  statement 'else'  ':'  . statement */
    case ARTL_ART_statement_36: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'if'  condition ':'  statement 'else'  ':'  statement .*/
    case ARTL_ART_statement_38: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement2 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       if (((__bool) condition1.v).value()) 
      artEvaluate(statement.statement1, statement1); 
    else
      artEvaluate(statement.statement2, statement2);  
   
      break;
    /*statement ::= 'while'  condition . statement */
    case ARTL_ART_statement_46: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), condition1));
      statement.condition1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'while'  condition statement .*/
    case ARTL_ART_statement_48: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
       artEvaluate(statement.condition1, condition1); 
    while (((__bool) condition1.v).value()) { 
      artEvaluate(statement.statement1, statement1); 
      artEvaluate(statement.condition1, condition1); 
    } 
  
      break;
    /*statement ::= 'for'  condition . '|'  statement '|'  statements 'end'  */
    case ARTL_ART_statement_56: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), condition1));
      statement.condition1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'for'  condition '|'  . statement '|'  statements 'end'  */
    case ARTL_ART_statement_58: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'for'  condition '|'  statement . '|'  statements 'end'  */
    case ARTL_ART_statement_60: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statement1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'for'  condition '|'  statement '|'  . statements 'end'  */
    case ARTL_ART_statement_62: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'for'  condition '|'  statement '|'  statements . 'end'  */
    case ARTL_ART_statement_64: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      statement.statements1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*statement ::= 'for'  condition '|'  statement '|'  statements 'end'  .*/
    case ARTL_ART_statement_66: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
       artEvaluate(statement.condition1, condition1);
  while (((__bool) condition1.v).value()) { 
    artEvaluate(statement.statement1, statement1); 
    artEvaluate(statement.statements1, statements1); 
   
    
    artEvaluate(statement.condition1, condition1); 
    }
  
      break;
    /*statement ::= 'display'  '('  . ')'  ';'  */
    case ARTL_ART_statement_74: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'display'  '('  ')'  . ';'  */
    case ARTL_ART_statement_76: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= 'display'  '('  ')'  ';'  .*/
    case ARTL_ART_statement_78: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      iTerms.valueUserPlugin.user(new __int32(4,0));
      break;
    /*statement ::= expression '->'  . 'translate'  '('  expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_86: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'translate'  . '('  expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_88: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'translate'  '('  . expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_90: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'translate'  '('  expression . ','  expression ')'  ';'  */
    case ARTL_ART_statement_92: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression2));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression2, null, null, null, null);
            break;
    /*statement ::= expression '->'  'translate'  '('  expression ','  . expression ')'  ';'  */
    case ARTL_ART_statement_94: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'translate'  '('  expression ','  expression . ')'  ';'  */
    case ARTL_ART_statement_96: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression3));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression3, null, null, null, null);
            break;
    /*statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  . ';'  */
    case ARTL_ART_statement_98: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'translate'  '('  expression ','  expression ')'  ';'  .*/
    case ARTL_ART_statement_100: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      iTerms.valueUserPlugin.user(new __int32(5,0), expression1.v, expression2.v, expression3.v);
      break;
    /*statement ::= expression '->'  . 'scale'  '('  expression ')'  ';'  */
    case ARTL_ART_statement_108: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'scale'  . '('  expression ')'  ';'  */
    case ARTL_ART_statement_110: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'scale'  '('  . expression ')'  ';'  */
    case ARTL_ART_statement_112: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'scale'  '('  expression . ')'  ';'  */
    case ARTL_ART_statement_114: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression2));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression2, null, null, null, null);
            break;
    /*statement ::= expression '->'  'scale'  '('  expression ')'  . ';'  */
    case ARTL_ART_statement_116: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'scale'  '('  expression ')'  ';'  .*/
    case ARTL_ART_statement_118: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      iTerms.valueUserPlugin.user(new __int32(7,0), expression1.v, expression2.v);
      break;
    /*statement ::= expression '->'  . 'duplicate'  '('  ')'  ';'  */
    case ARTL_ART_statement_126: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'duplicate'  . '('  ')'  ';'  */
    case ARTL_ART_statement_128: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'duplicate'  '('  . ')'  ';'  */
    case ARTL_ART_statement_130: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'duplicate'  '('  ')'  . ';'  */
    case ARTL_ART_statement_132: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'duplicate'  '('  ')'  ';'  .*/
    case ARTL_ART_statement_134: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      iTerms.valueUserPlugin.user(new __int32(8,0), expression1.v);
      break;
    /*statement ::= expression '->'  . 'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_142: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), expression1));
      ARTRD_expression(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, expression1, null, null, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'changeColour'  . '('  expression ','  expression ','  expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_144: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'changeColour'  '('  . expression ','  expression ','  expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_146: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression . ','  expression ','  expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_148: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression2));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression2, null, null, null, null);
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression ','  . expression ','  expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_150: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression ','  expression . ','  expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_152: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression3));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression3, null, null, null, null);
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  . expression ','  expression ')'  ';'  */
    case ARTL_ART_statement_154: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression . ','  expression ')'  ';'  */
    case ARTL_ART_statement_156: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression4));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression4, null, null, null, null);
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  . expression ')'  ';'  */
    case ARTL_ART_statement_158: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression . ')'  ';'  */
    case ARTL_ART_statement_160: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), expression5));
      ARTRD_expression(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, expression5, null, null, null, null);
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  . ';'  */
    case ARTL_ART_statement_162: 
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*statement ::= expression '->'  'changeColour'  '('  expression ','  expression ','  expression ','  expression ')'  ';'  .*/
    case ARTL_ART_statement_164: 
      ID1 = new ARTAT_ART_ID();
      condition1 = new ARTAT_ART_condition();
      expression1 = new ARTAT_ART_expression();
      expression2 = new ARTAT_ART_expression();
      expression3 = new ARTAT_ART_expression();
      expression4 = new ARTAT_ART_expression();
      expression5 = new ARTAT_ART_expression();
      statement1 = new ARTAT_ART_statement();
      statement2 = new ARTAT_ART_statement();
      statements1 = new ARTAT_ART_statements();
            ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement, ID1, condition1, expression1, expression2, expression3, expression4, expression5, statement1, statement2, statements1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      iTerms.valueUserPlugin.user(new __int32(6,0), expression1.v, expression2.v, expression3.v, expression4.v, expression5.v);
      break;
        default:
          throw new ARTException("ARTRD_statement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_statements(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_statement statement1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*statements ::= statement .*/
    case ARTL_ART_statements_4: 
      statement1 = new ARTAT_ART_statement();
            ARTRD_statements(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, statement1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, statement1, null, null, null, null, null, null, null, null, null, null);
            break;
    /*statements ::= statement statements .*/
    case ARTL_ART_statements_10: 
      statement1 = new ARTAT_ART_statement();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_statement(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, statement1, null, null, null, null, null, null, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_statements(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, null);
            break;
        default:
          throw new ARTException("ARTRD_statements: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_ID:  ARTRD_ID(artElement.element, artParent, artWriteable, (ARTAT_ART_ID) artAttributes); break;
    case ARTL_ART_INTEGER:  ARTRD_INTEGER(artElement.element, artParent, artWriteable, (ARTAT_ART_INTEGER) artAttributes); break;
    case ARTL_ART_condition:  ARTRD_condition(artElement.element, artParent, artWriteable, (ARTAT_ART_condition) artAttributes, null, null); break;
    case ARTL_ART_expression:  ARTRD_expression(artElement.element, artParent, artWriteable, (ARTAT_ART_expression) artAttributes, null, null, null, null); break;
    case ARTL_ART_operand:  ARTRD_operand(artElement.element, artParent, artWriteable, (ARTAT_ART_operand) artAttributes, null, null, null); break;
    case ARTL_ART_statement:  ARTRD_statement(artElement.element, artParent, artWriteable, (ARTAT_ART_statement) artAttributes, null, null, null, null, null, null, null, null, null, null); break;
    case ARTL_ART_statements: ARTRD_statements(artElement.element, artParent, artWriteable, null); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  ARTAT_ART_statements statements1 = new ARTAT_ART_statements();
  return  artEvaluator(statements1);
}

public ARTGLLRDT artEvaluator(ARTAT_ART_statements statements1) throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artLexer.artInputString);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), statements1));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), statements1, artNewParent, artNewWriteable);
  return artRDT;
}
};
