/*
 *                        AT&T - PROPRIETARY
 *          THIS FILE CONTAINS PROPRIETARY INFORMATION OF
 *        AT&T AND IS NOT TO BE DISCLOSED OR USED EXCEPT IN
 *             ACCORDANCE WITH APPLICABLE AGREEMENTS.
 *
 *          Copyright (c) 2013 AT&T Knowledge Ventures
 *              Unpublished and Not for Publication
 *                     All Rights Reserved
 */
package com.att.research.xacmlatt.pdp.policy;

import com.att.research.xacml.api.IdReferenceMatch;
import com.att.research.xacmlatt.pdp.eval.EvaluationContext;

/**
 * PolicyFinder is the interface for objects that can locate XACML Policies and PolicySets by identifier and contains the root
 * Policy or Policy set.  The interface is designed to allow for finders that can retrieve a root policy from a repository based on
 * matching a {@link com.att.research.xacml.api.Request}.
 * 
 * @author car
 * @version $Revision: 1.1 $
 */
public interface PolicyFinder {
	/**
	 * Gets the root {@link com.att.research.xacmlatt.pdp.policy.PolicyDef} from the policy store
	 * configured by the particular implementation of the <code>PolicyFinderFactory</code> class that
	 * is applicable to the {@link com.att.research.xacml.api.Request} in the given {@link com.att.research.xacmlatt.pdp.eval.EvaluationContext}.
	 * 
	 * @return a <code>PolicyFinderResult</code> with the root <code>PolicyDef</code>
	 */
	public PolicyFinderResult<PolicyDef> getRootPolicyDef(EvaluationContext evaluationContext);
	
	/**
	 * Gets the {@link com.att.research.xacmlatt.pdp.policy.Policy} that matches the given {@link com.att.research.xacml.api.IdReferenceMatch}.
	 * 
	 * @param idReferenceMatch the <code>IdReferenceMatch</code> to search for
	 * @return a <code>PolicyFinderResult</code> with the <code>Policy</code> matching the given <code>IdReferenceMatch</code>
	 */
	public PolicyFinderResult<Policy> getPolicy(IdReferenceMatch idReferenceMatch);
	
	/**
	 * Gets the {@link com.att.research.xacmlatt.pdp.policy.PolicySet} that matches the given {@link com.att.research.xacml.api.IdReferenceMatch}.
	 * 
	 * @param idReferenceMatch the <code>IdReferenceMatch</code> to search for
	 * @return a <code>PolicyFinderResult</code> with the <code>PolicySet</code> matching the given <code>IdReferenceMatch</code>.
	 */
	public PolicyFinderResult<PolicySet> getPolicySet(IdReferenceMatch idReferenceMatch);

}
