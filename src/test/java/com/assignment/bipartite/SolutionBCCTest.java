package com.assignment.bipartite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionBCCTest {

	SolutionOne solution;
	
	@BeforeEach
	public void init() {
		solution = new SolutionOne();
	}
	
	@DisplayName("Test Case 10: A valid bipartite graph")
	@Test
    public void testBipartiteGraph_BCC_valid_bipartiteGraph_TC10() {
		 
         // T10 : BCC 
		
        int[][] bipartiteGraph = {
            {1, 3},
            {0, 2},
            {1, 3},
            {0, 2}
        };
        assertTrue(solution.isBipartite(bipartiteGraph));
    }
	
	@DisplayName("Test case 11: Non Bipartite graph")
	@Test
	public void testBipartiteGraph_BCC_nonBipartiteGraph_TC11() {
		 
		//T11 BCC
		
		int[][] bipartiteGraph = {
			    {1, 2, 3},
			    {0, 2},
			    {0, 1, 4},
			    {0, 4},
			    {2, 3}
			};
		
		assertFalse(solution.isBipartite(bipartiteGraph));
	}
	
	@DisplayName("Test Case 12 : Empty Input")
	@Test
    public void testBipartiteGraph_BCC_invalid_emptyInput_TC12() {
		//
		// T12 : BCC
		
        int[][] bipartiteGraph = new int[0][0];
        assertTrue(solution.isBipartite(bipartiteGraph));
    }
	
	@DisplayName(" Test Case 13: self_edge nodes")
	@Test
    public void testBipartiteGraph_BCC_invalid_selfEdgeNodes_TC13() {
		//
		//T13 : BCC
		
        int[][] BipartiteGraph = {
        		{0},
        		{1},
        		{2}
        	};
        assertFalse(solution.isBipartite(BipartiteGraph));
    }
	
	@DisplayName("Test Case 14: Invalid - directed graph (Parallel edges)")
	@Test
    public void testBipartiteGraph_BCC_invalid_directedGraph_TC14() {
		// 
		// T14 : BCC
		
        int[][] nonBipartiteGraph = {
        	    {1, 2},
        	    {0, 2},
        	    {0, 1},
        	    {2}
        	};
        
        assertFalse(solution.isBipartite(nonBipartiteGraph));
    }
	
	@DisplayName("Test Case 15: A valid bipartite graph")
	@Test
    public void testBipartiteGraph_BCC_valid_twoColored_bipartiteGraph_TC15() {
		 // 
         // T15 : BCC 
		
        int[][] bipartiteGraph = {
            {1, 3},
            {0, 2},
            {1, 3},
            {0, 2}
        };
        assertTrue(solution.isBipartite(bipartiteGraph));
    }
	
	@DisplayName("Test case 16: Non Bipartite graph ")
	@Test
	public void testBipartiteGraph_BCC_invalid_threeColored_bipartiteGraph_TC16() {
		//
		//T16 BCC
		
		int[][] bipartiteGraph = {
			    {1, 2, 3},
			    {0, 2},
			    {0, 1, 4},
			    {0, 4},
			    {2, 3}
			};
		
		assertFalse(solution.isBipartite(bipartiteGraph));
	}
	

}
