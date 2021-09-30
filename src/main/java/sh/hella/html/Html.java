package sh.hella.html;

import sh.hella.html.element.Attribute;
import sh.hella.html.element.CompositeElement;
import sh.hella.html.element.HtmlDocumentElement;
import sh.hella.html.element.JavaScriptElement;
import sh.hella.html.element.Element;
import sh.hella.html.element.TextElement;

/**
 * The interface Html.
 */
@SuppressWarnings("unused")
public interface Html {

    /**
     * An element that represents a composite group of elements.
     * @param elements The elements
     * @return The composite element
     */
    static Element elements(Element... elements) {
        return new CompositeElement(elements);
    }

    /**
     * Text node.
     *
     * @param text the text
     * @return the node
     */
    static Element text(String text) {
        return new TextElement(text);
    }

    /**
     * Onclick node.
     *
     * @param javaScriptNode The javascript node
     * @return the attribute node
     */
    static Attribute onclick(JavaScriptElement javaScriptNode) {
        return new Attribute("onclick", javaScriptNode.toString());
    }

    // Attributes

    /**
     * Attr attribute node.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute node
     */
    static Attribute attr(String key, String value) {
        return new Attribute(key, value);
    }

    /**
     * Accept attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute accept(String value) {
        return attr("href", value);
    }

    /**
     * Accept charset attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute accept_charset(String value) {
        return attr("accept-charset", value);
    }

    /**
     * Accesskey attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute accesskey(String value) {
        return attr("accesskey", value);
    }

    /**
     * Action attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute action(String value) {
        return attr("action", value);
    }

    /**
     * Align attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute align(String value) {
        return attr("align", value);
    }

    /**
     * Allow attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute allow(String value) {
        return attr("allow", value);
    }

    /**
     * Alt attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute alt(String value) {
        return attr("alt", value);
    }

    /**
     * Async attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute async(String value) {
        return attr("async", value);
    }

    /**
     * Autocapitalize attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute autocapitalize(String value) {
        return attr("autocapitalize", value);
    }

    /**
     * Autocomplete attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute autocomplete(String value) {
        return attr("autocomplete", value);
    }

    /**
     * Autofocus attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute autofocus(String value) {
        return attr("autofocus", value);
    }

    /**
     * Autoplay attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute autoplay(String value) {
        return attr("autoplay", value);
    }

    /**
     * Background attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute background(String value) {
        return attr("background", value);
    }

    /**
     * Bgcolor attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute bgcolor(String value) {
        return attr("bgcolor", value);
    }

    /**
     * Border attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute border(String value) {
        return attr("border", value);
    }

    /**
     * Buffered attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute buffered(String value) {
        return attr("buffered", value);
    }

    /**
     * Capture attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute capture(String value) {
        return attr("capture", value);
    }

    /**
     * Challenge attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute challenge(String value) {
        return attr("challenge", value);
    }

    /**
     * Charset attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute charset(String value) {
        return attr("charset", value);
    }

    /**
     * Checked attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute checked(String value) {
        return attr("checked", value);
    }

    /**
     * Cite attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute cite(String value) {
        return attr("cite", value);
    }

    /**
     * Clazz attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute clazz(String value) {
        return attr("class", value);
    }

    /**
     * Classs attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute classs(String value) {
        return attr("class", value);
    }

    /**
     * Code attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute code(String value) {
        return attr("code", value);
    }

    /**
     * Codebase attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute codebase(String value) {
        return attr("codebase", value);
    }

    /**
     * Color attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute color(String value) {
        return attr("color", value);
    }

    /**
     * Cols attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute cols(String value) {
        return attr("cols", value);
    }

    /**
     * Colspan attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute colspan(String value) {
        return attr("colspan", value);
    }

    /**
     * Content attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute content(String value) {
        return attr("content", value);
    }

    /**
     * Contenteditable attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute contenteditable(String value) {
        return attr("contenteditable", value);
    }

    /**
     * Contextmenu attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute contextmenu(String value) {
        return attr("contextmenu", value);
    }

    /**
     * Controls attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute controls(String value) {
        return attr("controls", value);
    }

    /**
     * Coords attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute coords(String value) {
        return attr("coords", value);
    }

    /**
     * Crossorigin attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute crossorigin(String value) {
        return attr("crossorigin", value);
    }

    /**
     * Csp attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute csp(String value) {
        return attr("csp", value);
    }

    /**
     * Data attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute data(String value) {
        return attr("data", value);
    }

    /**
     * Data attribute node.
     *
     * @param key   the key
     * @param value the value
     * @return the attribute node
     */
    static Attribute data_(String key, String value) {
        return attr("data-" + key, value);
    }

    /**
     * Datetime attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute datetime(String value) {
        return attr("datetime", value);
    }

    /**
     * Decoding attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute decoding(String value) {
        return attr("decoding", value);
    }

    /**
     * Dfault attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute dfault(String value) {
        return attr("default", value);
    }

    /**
     * Defaultt attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute defaultt(String value) {
        return attr("default", value);
    }

    /**
     * Defer attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute defer(String value) {
        return attr("defer", value);
    }

    /**
     * Dir attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute dir(String value) {
        return attr("dir", value);
    }

    /**
     * Dirname attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute dirname(String value) {
        return attr("dirname", value);
    }

    /**
     * Disabled attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute disabled(String value) {
        return attr("disabled", value);
    }

    /**
     * Download attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute download(String value) {
        return attr("download", value);
    }

    /**
     * Draggable attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute draggable(String value) {
        return attr("draggable", value);
    }

    /**
     * Enctype attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute enctype(String value) {
        return attr("enctype", value);
    }

    /**
     * Enterkeyhint attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute enterkeyhint(String value) {
        return attr("enterkeyhint", value);
    }

    /**
     * Forr attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute forr(String value) {
        return attr("for", value);
    }

    /**
     * Form attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute form(String value) {
        return attr("form", value);
    }

    /**
     * Formaction attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute formaction(String value) {
        return attr("formaction", value);
    }

    /**
     * Formenctype attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute formenctype(String value) {
        return attr("formenctype", value);
    }

    /**
     * Formmethod attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute formmethod(String value) {
        return attr("formmethod", value);
    }

    /**
     * Formnovalidate attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute formnovalidate(String value) {
        return attr("formnovalidate", value);
    }

    /**
     * Formtarget attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute formtarget(String value) {
        return attr("formtarget", value);
    }

    /**
     * Headers attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute headers(String value) {
        return attr("headers", value);
    }

    /**
     * Height attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute height(String value) {
        return attr("height", value);
    }

    /**
     * Hidden attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute hidden(String value) {
        return attr("hidden", value);
    }

    /**
     * High attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute high(String value) {
        return attr("high", value);
    }

    /**
     * Href attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute href(String value) {
        return attr("href", value);
    }

    /**
     * Hreflang attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute hreflang(String value) {
        return attr("hreflang", value);
    }

    /**
     * Http equiv attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute http_equiv(String value) {
        return attr("http-equiv", value);
    }

    /**
     * Icon attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute icon(String value) {
        return attr("icon", value);
    }

    /**
     * Id attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute id(String value) {
        return attr("id", value);
    }

    /**
     * Importance attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute importance(String value) {
        return attr("importance", value);
    }

    /**
     * Integrity attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute integrity(String value) {
        return attr("integrity", value);
    }

    /**
     * Intrinsicsize attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute intrinsicsize(String value) {
        return attr("intrinsicsize", value);
    }

    /**
     * Inputmode attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute inputmode(String value) {
        return attr("inputmode", value);
    }

    /**
     * Ismap attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute ismap(String value) {
        return attr("ismap", value);
    }

    /**
     * Itemprop attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute itemprop(String value) {
        return attr("itemprop", value);
    }

    /**
     * Keytype attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute keytype(String value) {
        return attr("keytype", value);
    }

    /**
     * Kind attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute kind(String value) {
        return attr("kind", value);
    }

    /**
     * Label attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute label(String value) {
        return attr("label", value);
    }

    /**
     * Lang attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute lang(String value) {
        return attr("lang", value);
    }

    /**
     * Language attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute language(String value) {
        return attr("language", value);
    }

    /**
     * Loading attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute loading(String value) {
        return attr("loading", value);
    }

    /**
     * List attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute list(String value) {
        return attr("list", value);
    }

    /**
     * Loop attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute loop(String value) {
        return attr("loop", value);
    }

    /**
     * Low attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute low(String value) {
        return attr("low", value);
    }

    /**
     * Manifest attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute manifest(String value) {
        return attr("manifest", value);
    }

    /**
     * Max attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute max(String value) {
        return attr("max", value);
    }

    /**
     * Maxlength attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute maxlength(String value) {
        return attr("maxlength", value);
    }

    /**
     * Minlength attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute minlength(String value) {
        return attr("minlength", value);
    }

    /**
     * Media attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute media(String value) {
        return attr("media", value);
    }

    /**
     * Method attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute method(String value) {
        return attr("method", value);
    }

    /**
     * Min attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute min(String value) {
        return attr("min", value);
    }

    /**
     * Multiple attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute multiple(String value) {
        return attr("multiple", value);
    }

    /**
     * Muted attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute muted(String value) {
        return attr("muted", value);
    }

    /**
     * Name attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute name(String value) {
        return attr("name", value);
    }

    /**
     * Novalidate attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute novalidate(String value) {
        return attr("novalidate", value);
    }

    /**
     * Open attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute open(String value) {
        return attr("open", value);
    }

    /**
     * Optimum attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute optimum(String value) {
        return attr("optimum", value);
    }

    /**
     * Pattern attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute pattern(String value) {
        return attr("pattern", value);
    }

    /**
     * Ping attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute ping(String value) {
        return attr("ping", value);
    }

    /**
     * Placeholder attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute placeholder(String value) {
        return attr("placeholder", value);
    }

    /**
     * Poster attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute poster(String value) {
        return attr("poster", value);
    }

    /**
     * Preload attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute preload(String value) {
        return attr("preload", value);
    }

    /**
     * Radiogroup attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute radiogroup(String value) {
        return attr("radiogroup", value);
    }

    /**
     * Readonly attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute readonly(String value) {
        return attr("readonly", value);
    }

    /**
     * Referrerpolicy attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute referrerpolicy(String value) {
        return attr("referrerpolicy", value);
    }

    /**
     * Rel attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute rel(String value) {
        return attr("rel", value);
    }

    /**
     * Required attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute required(String value) {
        return attr("required", value);
    }

    /**
     * Reversed attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute reversed(String value) {
        return attr("reversed", value);
    }

    /**
     * Rows attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute rows(String value) {
        return attr("rows", value);
    }

    /**
     * Rowspan attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute rowspan(String value) {
        return attr("rowspan", value);
    }

    /**
     * Sandbox attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute sandbox(String value) {
        return attr("sandbox", value);
    }

    /**
     * Scope attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute scope(String value) {
        return attr("scope", value);
    }

    /**
     * Scoped attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute scoped(String value) {
        return attr("scoped", value);
    }

    /**
     * Selected attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute selected(String value) {
        return attr("selected", value);
    }

    /**
     * Shape attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute shape(String value) {
        return attr("shape", value);
    }

    /**
     * Size attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute size(String value) {
        return attr("size", value);
    }

    /**
     * Sizes attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute sizes(String value) {
        return attr("sizes", value);
    }

    /**
     * Slot attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute slot(String value) {
        return attr("slot", value);
    }

    /**
     * Span attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute span(String value) {
        return attr("span", value);
    }

    /**
     * Spellcheck attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute spellcheck(String value) {
        return attr("spellcheck", value);
    }

    /**
     * Src attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute src(String value) {
        return attr("src", value);
    }

    /**
     * Srcdoc attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute srcdoc(String value) {
        return attr("srcdoc", value);
    }

    /**
     * Srclang attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute srclang(String value) {
        return attr("srclang", value);
    }

    /**
     * Srcset attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute srcset(String value) {
        return attr("srcset", value);
    }

    /**
     * Start attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute start(String value) {
        return attr("start", value);
    }

    /**
     * Step attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute step(String value) {
        return attr("step", value);
    }

    /**
     * Style attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute style(String value) {
        return attr("style", value);
    }

    /**
     * Summary attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute summary(String value) {
        return attr("summary", value);
    }

    /**
     * Tabindex attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute tabindex(String value) {
        return attr("tabindex", value);
    }

    /**
     * Target attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute target(String value) {
        return attr("target", value);
    }

    /**
     * Title attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute title(String value) {
        return attr("title", value);
    }

    /**
     * Translate attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute translate(String value) {
        return attr("translate", value);
    }

    /**
     * Type attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute type(String value) {
        return attr("type", value);
    }

    /**
     * Usemap attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute usemap(String value) {
        return attr("usemap", value);
    }

    /**
     * Value attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute value(String value) {
        return attr("value", value);
    }

    /**
     * Width attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute width(String value) {
        return attr("width", value);
    }

    /**
     * Wrap attribute node.
     *
     * @param value the value
     * @return the attribute node
     */
    static Attribute wrap(String value) {
        return attr("wrap", value);
    }

    // Tags

    /**
     * Tag node.
     *
     * @param name     the name
     * @param children the children
     * @return the node
     */
    static Element tag(String name, Element... children) {
        return new Element(name, children);
    }

    // Main root

    /**
     * Html node.
     *
     * @param children the children
     * @return the node
     */
    static Element html(Element... children) {
        return new HtmlDocumentElement(children);
    }

    // Document metadata

    /**
     * Base node.
     *
     * @param children the children
     * @return the node
     */
    static Element base(Element... children) {
        return tag("base", children);
    }

    /**
     * Head node.
     *
     * @param children the children
     * @return the node
     */
    static Element head(Element... children) {
        return tag("head", children);
    }

    /**
     * Link node.
     *
     * @param children the children
     * @return the node
     */
    static Element link(Element... children) {
        return tag("link", children);
    }

    /**
     * Meta node.
     *
     * @param children the children
     * @return the node
     */
    static Element meta(Element... children) {
        return tag("meta", children);
    }

    /**
     * Style node.
     *
     * @param children the children
     * @return the node
     */
    static Element style(Element... children) {
        return tag("style", children);
    }

    /**
     * Title node.
     *
     * @param children the children
     * @return the node
     */
    static Element title(Element... children) {
        return tag("title", children);
    }

    // Sectioning root

    /**
     * Body node.
     *
     * @param children the children
     * @return the node
     */
    static Element body(Element... children) {
        return tag("body", children);
    }

    // Content sectioning


    /**
     * Address node.
     *
     * @param children the children
     * @return the node
     */
    static Element address(Element... children) {
        return tag("address", children);
    }

    /**
     * Article node.
     *
     * @param children the children
     * @return the node
     */
    static Element article(Element... children) {
        return tag("article", children);
    }

    /**
     * Aside node.
     *
     * @param children the children
     * @return the node
     */
    static Element aside(Element... children) {
        return tag("aside", children);
    }

    /**
     * Footer node.
     *
     * @param children the children
     * @return the node
     */
    static Element footer(Element... children) {
        return tag("footer", children);
    }

    /**
     * Header node.
     *
     * @param children the children
     * @return the node
     */
    static Element header(Element... children) {
        return tag("header", children);
    }

    /**
     * H 1 node.
     *
     * @param children the children
     * @return the node
     */
    static Element h1(Element... children) {
        return tag("h1", children);
    }
    /**
     * H 2 node.
     *
     * @param children the children
     * @return the node
     */
    static Element h2(Element... children) {
        return tag("h2", children);
    }

    /**
     * H 3 node.
     *
     * @param children the children
     * @return the node
     */
    static Element h3(Element... children) {
        return tag("h3", children);
    }

    /**
     * H 4 node.
     *
     * @param children the children
     * @return the node
     */
    static Element h4(Element... children) {
        return tag("h4", children);
    }

    /**
     * H 5 node.
     *
     * @param children the children
     * @return the node
     */
    static Element h5(Element... children) {
        return tag("h5", children);
    }

    /**
     * H 6 node.
     *
     * @param children the children
     * @return the node
     */
    static Element h6(Element... children) {
        return tag("h6", children);
    }

    /**
     * Main node.
     *
     * @param children the children
     * @return the node
     */
    static Element main(Element... children) {
        return tag("main", children);
    }

    /**
     * Nav node.
     *
     * @param children the children
     * @return the node
     */
    static Element nav(Element... children) {
        return tag("nav", children);
    }

    /**
     * Section node.
     *
     * @param children the children
     * @return the node
     */
    static Element section(Element... children) {
        return tag("section", children);
    }

    // Text content

    /**
     * Blockquote node.
     *
     * @param children the children
     * @return the node
     */
    static Element blockquote(Element... children) {
        return tag("blockquote", children);
    }

    /**
     * Dd node.
     *
     * @param children the children
     * @return the node
     */
    static Element dd(Element... children) {
        return tag("dd", children);
    }

    /**
     * Div node.
     *
     * @param children the children
     * @return the node
     */
    static Element div(Element... children) {
        return tag("div", children);
    }

    /**
     * Dl node.
     *
     * @param children the children
     * @return the node
     */
    static Element dl(Element... children) {
        return tag("dl", children);
    }

    /**
     * Dt node.
     *
     * @param children the children
     * @return the node
     */
    static Element dt(Element... children) {
        return tag("dt", children);
    }

    /**
     * Figcaption node.
     *
     * @param children the children
     * @return the node
     */
    static Element figcaption(Element... children) {
        return tag("figcaption", children);
    }

    /**
     * Figure node.
     *
     * @param children the children
     * @return the node
     */
    static Element figure(Element... children) {
        return tag("figure", children);
    }

    /**
     * Hr node.
     *
     * @param children the children
     * @return the node
     */
    static Element hr(Element... children) {
        return tag("hr", children);
    }

    /**
     * Li node.
     *
     * @param children the children
     * @return the node
     */
    static Element li(Element... children) {
        return tag("li", children);
    }

    /**
     * Ol node.
     *
     * @param children the children
     * @return the node
     */
    static Element ol(Element... children) {
        return tag("ol", children);
    }

    /**
     * P node.
     *
     * @param children the children
     * @return the node
     */
    static Element p(Element... children) {
        return tag("p", children);
    }

    /**
     * Pre node.
     *
     * @param children the children
     * @return the node
     */
    static Element pre(Element... children) {
        return tag("pre", children);
    }

    /**
     * Ul node.
     *
     * @param children the children
     * @return the node
     */
    static Element ul(Element... children) {
        return tag("ul", children);
    }

    // Inline text semantics

    /**
     * A node.
     *
     * @param children the children
     * @return the node
     */
    static Element a(Element... children) {
        return tag("a", children);
    }

    /**
     * Abbr node.
     *
     * @param children the children
     * @return the node
     */
    static Element abbr(Element... children) {
        return tag("abbr", children);
    }

    /**
     * B node.
     *
     * @param children the children
     * @return the node
     */
    static Element b(Element... children) {
        return tag("b", children);
    }

    /**
     * Bdi node.
     *
     * @param children the children
     * @return the node
     */
    static Element bdi(Element... children) {
        return tag("bdi", children);
    }

    /**
     * Bdo node.
     *
     * @param children the children
     * @return the node
     */
    static Element bdo(Element... children) {
        return tag("bdo", children);
    }

    /**
     * Br node.
     *
     * @param children the children
     * @return the node
     */
    static Element br(Element... children) {
        return tag("br", children);
    }

    /**
     * Cite node.
     *
     * @param children the children
     * @return the node
     */
    static Element cite(Element... children) {
        return tag("cite", children);
    }

    /**
     * Code node.
     *
     * @param children the children
     * @return the node
     */
    static Element code(Element... children) {
        return tag("code", children);
    }

    /**
     * Data node.
     *
     * @param children the children
     * @return the node
     */
    static Element data(Element... children) {
        return tag("data", children);
    }

    /**
     * Dfn node.
     *
     * @param children the children
     * @return the node
     */
    static Element dfn(Element... children) {
        return tag("dfn", children);
    }

    /**
     * Em node.
     *
     * @param children the children
     * @return the node
     */
    static Element em(Element... children) {
        return tag("em", children);
    }

    /**
     * node.
     *
     * @param children the children
     * @return the node
     */
    static Element i(Element... children) {
        return tag("i", children);
    }

    /**
     * Kbd node.
     *
     * @param children the children
     * @return the node
     */
    static Element kbd(Element... children) {
        return tag("kbd", children);
    }

    /**
     * Mark node.
     *
     * @param children the children
     * @return the node
     */
    static Element mark(Element... children) {
        return tag("mark", children);
    }

    /**
     * Q node.
     *
     * @param children the children
     * @return the node
     */
    static Element q(Element... children) {
        return tag("q", children);
    }

    /**
     * Rp node.
     *
     * @param children the children
     * @return the node
     */
    static Element rp(Element... children) {
        return tag("rp", children);
    }

    /**
     * Rt node.
     *
     * @param children the children
     * @return the node
     */
    static Element rt(Element... children) {
        return tag("rt", children);
    }

    /**
     * Ruby node.
     *
     * @param children the children
     * @return the node
     */
    static Element ruby(Element... children) {
        return tag("ruby", children);
    }

    /**
     * S node.
     *
     * @param children the children
     * @return the node
     */
    static Element s(Element... children) {
        return tag("s", children);
    }

    /**
     * Samp node.
     *
     * @param children the children
     * @return the node
     */
    static Element samp(Element... children) {
        return tag("samp", children);
    }

    /**
     * Small node.
     *
     * @param children the children
     * @return the node
     */
    static Element small(Element... children) {
        return tag("small", children);
    }

    /**
     * Span node.
     *
     * @param children the children
     * @return the node
     */
    static Element span(Element... children) {
        return tag("span", children);
    }

    /**
     * Strong node.
     *
     * @param children the children
     * @return the node
     */
    static Element strong(Element... children) {
        return tag("strong", children);
    }

    /**
     * Sub node.
     *
     * @param children the children
     * @return the node
     */
    static Element sub(Element... children) {
        return tag("sub", children);
    }

    /**
     * Sup node.
     *
     * @param children the children
     * @return the node
     */
    static Element sup(Element... children) {
        return tag("sup", children);
    }

    /**
     * Time node.
     *
     * @param children the children
     * @return the node
     */
    static Element time(Element... children) {
        return tag("time", children);
    }

    /**
     * U node.
     *
     * @param children the children
     * @return the node
     */
    static Element u(Element... children) {
        return tag("u", children);
    }

    /**
     * Var node.
     *
     * @param children the children
     * @return the node
     */
    static Element var(Element... children) {
        return tag("var", children);
    }

    /**
     * Wbr node.
     *
     * @param children the children
     * @return the node
     */
    static Element wbr(Element... children) {
        return tag("wbr", children);
    }

    // Image and multimedia

    /**
     * Area node.
     *
     * @param children the children
     * @return the node
     */
    static Element area(Element... children) {
        return tag("area", children);
    }

    /**
     * Audio node.
     *
     * @param children the children
     * @return the node
     */
    static Element audio(Element... children) {
        return tag("audio", children);
    }

    /**
     * Img node.
     *
     * @param children the children
     * @return the node
     */
    static Element img(Element... children) {
        return tag("img", children);
    }

    /**
     * Map node.
     *
     * @param children the children
     * @return the node
     */
    static Element map(Element... children) {
        return tag("map", children);
    }

    /**
     * Track node.
     *
     * @param children the children
     * @return the node
     */
    static Element track(Element... children) {
        return tag("track", children);
    }

    /**
     * Video node.
     *
     * @param children the children
     * @return the node
     */
    static Element video(Element... children) {
        return tag("video", children);
    }

    // Embedded content

    /**
     * Embed node.
     *
     * @param children the children
     * @return the node
     */
    static Element embed(Element... children) {
        return tag("embed", children);
    }

    /**
     * Iframe node.
     *
     * @param children the children
     * @return the node
     */
    static Element iframe(Element... children) {
        return tag("iframe", children);
    }

    /**
     * Object node.
     *
     * @param children the children
     * @return the node
     */
    static Element object(Element... children) {
        return tag("objcet", children);
    }

    /**
     * Param node.
     *
     * @param children the children
     * @return the node
     */
    static Element param(Element... children) {
        return tag("param", children);
    }

    /**
     * Picture node.
     *
     * @param children the children
     * @return the node
     */
    static Element picture(Element... children) {
        return tag("picture", children);
    }

    /**
     * Portal node.
     *
     * @param children the children
     * @return the node
     */
    static Element portal(Element... children) {
        return tag("portal", children);
    }

    /**
     * Source node.
     *
     * @param children the children
     * @return the node
     */
    static Element source(Element... children) {
        return tag("source", children);
    }

    // SVG and MathML

    /**
     * Svg node.
     *
     * @param children the children
     * @return the node
     */
    static Element svg(Element... children) {
        return tag("svg", children);
    }

    /**
     * Math node.
     *
     * @param children the children
     * @return the node
     */
    static Element math(Element... children) {
        return tag("math", children);
    }

    // Scripting

    /**
     * Canvas node.
     *
     * @param children the children
     * @return the node
     */
    static Element canvas(Element... children) {
        return tag("canvas", children);
    }

    /**
     * Noscript node.
     *
     * @param children the children
     * @return the node
     */
    static Element noscript(Element... children) {
        return tag("noscript", children);
    }

    /**
     * Script node.
     *
     * @param children the children
     * @return the node
     */
    static Element script(Element... children) {
        return tag("script", children);
    }

    // Demarcating edits

    /**
     * Del node.
     *
     * @param children the children
     * @return the node
     */
    static Element del(Element... children) {
        return tag("del", children);
    }

    /**
     * Ins node.
     *
     * @param children the children
     * @return the node
     */
    static Element ins(Element... children) {
        return tag("ins", children);
    }

    // Table content

    /**
     * Caption node.
     *
     * @param children the children
     * @return the node
     */
    static Element caption(Element... children) {
        return tag("caption", children);
    }

    /**
     * Col node.
     *
     * @param children the children
     * @return the node
     */
    static Element col(Element... children) {
        return tag("col", children);
    }

    /**
     * Colgroup node.
     *
     * @param children the children
     * @return the node
     */
    static Element colgroup(Element... children) {
        return tag("colgroup", children);
    }

    /**
     * Table node.
     *
     * @param children the children
     * @return the node
     */
    static Element table(Element... children) {
        return tag("table", children);
    }

    /**
     * Tbody node.
     *
     * @param children the children
     * @return the node
     */
    static Element tbody(Element... children) {
        return tag("tbody", children);
    }

    /**
     * Td node.
     *
     * @param children the children
     * @return the node
     */
    static Element td(Element... children) {
        return tag("td", children);
    }

    /**
     * Tfoot node.
     *
     * @param children the children
     * @return the node
     */
    static Element tfoot(Element... children) {
        return tag("tfoot", children);
    }

    /**
     * Th node.
     *
     * @param children the children
     * @return the node
     */
    static Element th(Element... children) {
        return tag("th", children);
    }

    /**
     * Thead node.
     *
     * @param children the children
     * @return the node
     */
    static Element thead(Element... children) {
        return tag("thead", children);
    }

    /**
     * Tr node.
     *
     * @param children the children
     * @return the node
     */
    static Element tr(Element... children) {
        return tag("tr", children);
    }

    // Forms

    /**
     * Button node.
     *
     * @param children the children
     * @return the node
     */
    static Element button(Element... children) {
        return tag("button", children);
    }

    /**
     * Datalist node.
     *
     * @param children the children
     * @return the node
     */
    static Element datalist(Element... children) {
        return tag("datalist", children);
    }

    /**
     * Fieldset node.
     *
     * @param children the children
     * @return the node
     */
    static Element fieldset(Element... children) {
        return tag("fieldset", children);
    }

    /**
     * Form node.
     *
     * @param children the children
     * @return the node
     */
    static Element form(Element... children) {
        return tag("form", children);
    }

    /**
     * Input node.
     *
     * @param children the children
     * @return the node
     */
    static Element input(Element... children) {
        return tag("input", children);
    }

    /**
     * Label node.
     *
     * @param children the children
     * @return the node
     */
    static Element label(Element... children) {
        return tag("label", children);
    }

    /**
     * Legend node.
     *
     * @param children the children
     * @return the node
     */
    static Element legend(Element... children) {
        return tag("legend", children);
    }

    /**
     * Meter node.
     *
     * @param children the children
     * @return the node
     */
    static Element meter(Element... children) {
        return tag("meter", children);
    }

    /**
     * Optgroup node.
     *
     * @param children the children
     * @return the node
     */
    static Element optgroup(Element... children) {
        return tag("optgroup", children);
    }

    /**
     * Option node.
     *
     * @param children the children
     * @return the node
     */
    static Element option(Element... children) {
        return tag("option", children);
    }

    /**
     * Output node.
     *
     * @param children the children
     * @return the node
     */
    static Element output(Element... children) {
        return tag("output", children);
    }

    /**
     * Progress node.
     *
     * @param children the children
     * @return the node
     */
    static Element progress(Element... children) {
        return tag("progress", children);
    }

    /**
     * Select node.
     *
     * @param children the children
     * @return the node
     */
    static Element select(Element... children) {
        return tag("select", children);
    }

    /**
     * Textarea node.
     *
     * @param children the children
     * @return the node
     */
    static Element textarea(Element... children) {
        return tag("textarea", children);
    }

    // Interactive elements

    /**
     * Details node.
     *
     * @param children the children
     * @return the node
     */
    static Element details(Element... children) {
        return tag("details", children);
    }

    /**
     * Dialog node.
     *
     * @param children the children
     * @return the node
     */
    static Element dialog(Element... children) {
        return tag("dialog", children);
    }

    /**
     * Menu node.
     *
     * @param children the children
     * @return the node
     */
    static Element menu(Element... children) {
        return tag("menu", children);
    }

    /**
     * Summary node.
     *
     * @param children the children
     * @return the node
     */
    static Element summary(Element... children) {
        return tag("summary", children);
    }

    /**
     * Slot node.
     *
     * @param children the children
     * @return the node
     */
    static Element slot(Element... children) {
        return tag("slot", children);
    }

    /**
     * Template node.
     *
     * @param children the children
     * @return the node
     */
    static Element template(Element... children) {
        return tag("template", children);
    }
}
