/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 21.01.2020 17:08:40                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Venue;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct Concert}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedConcert extends VariantProduct
{
	/** Qualifier of the <code>Concert.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Concert.concertType</code> attribute **/
	public static final String CONCERTTYPE = "concertType";
	/** Qualifier of the <code>Concert.venues</code> attribute **/
	public static final String VENUES = "venues";
	/**
	* {@link OneToManyHandler} for handling 1:n VENUES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Venue> VENUESHANDLER = new OneToManyHandler<Venue>(
	ConcerttoursConstants.TC.VENUE,
	false,
	"concert",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(CONCERTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.concertType</code> attribute.
	 * @return the concertType - type of concert (indoors or open air)
	 */
	public EnumerationValue getConcertType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CONCERTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.concertType</code> attribute.
	 * @return the concertType - type of concert (indoors or open air)
	 */
	public EnumerationValue getConcertType()
	{
		return getConcertType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.concertType</code> attribute. 
	 * @param value the concertType - type of concert (indoors or open air)
	 */
	public void setConcertType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CONCERTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.concertType</code> attribute. 
	 * @param value the concertType - type of concert (indoors or open air)
	 */
	public void setConcertType(final EnumerationValue value)
	{
		setConcertType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.date</code> attribute.
	 * @return the date - date of concert
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.date</code> attribute.
	 * @return the date - date of concert
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.date</code> attribute. 
	 * @param value the date - date of concert
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.date</code> attribute. 
	 * @param value the date - date of concert
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.venues</code> attribute.
	 * @return the venues
	 */
	public Set<Venue> getVenues(final SessionContext ctx)
	{
		return (Set<Venue>)VENUESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.venues</code> attribute.
	 * @return the venues
	 */
	public Set<Venue> getVenues()
	{
		return getVenues( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.venues</code> attribute. 
	 * @param value the venues
	 */
	public void setVenues(final SessionContext ctx, final Set<Venue> value)
	{
		VENUESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.venues</code> attribute. 
	 * @param value the venues
	 */
	public void setVenues(final Set<Venue> value)
	{
		setVenues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to venues. 
	 * @param value the item to add to venues
	 */
	public void addToVenues(final SessionContext ctx, final Venue value)
	{
		VENUESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to venues. 
	 * @param value the item to add to venues
	 */
	public void addToVenues(final Venue value)
	{
		addToVenues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from venues. 
	 * @param value the item to remove from venues
	 */
	public void removeFromVenues(final SessionContext ctx, final Venue value)
	{
		VENUESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from venues. 
	 * @param value the item to remove from venues
	 */
	public void removeFromVenues(final Venue value)
	{
		removeFromVenues( getSession().getSessionContext(), value );
	}
	
}
